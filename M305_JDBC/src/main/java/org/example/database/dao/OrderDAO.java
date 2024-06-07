package org.example.database.dao;

import jakarta.persistence.TypedQuery;
import org.example.database.entity.Employee;
import org.example.database.entity.Order;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.Date;
import java.util.List;

public class OrderDAO {

    public void insert(Order order) {
        // these 2 lines of code prepare the hibernate session for use
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();

        // begin the transaction
        session.getTransaction().begin();

        // insert the employee to the database
        session.save(order);

        /// commit our transaction
        session.getTransaction().commit();

        // cleanup the session
        session.close();
    }

    public void update(Order order) {
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();
        session.getTransaction().begin();

        // this is the only line that changed
        session.merge(order);

        session.getTransaction().commit();
        session.close();
    }

    public void delete(Order order) {
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();
        session.getTransaction().begin();

        // this is the only line that changed
        session.delete(order);

        session.getTransaction().commit();
        session.close();
    }


    public Order findById(Integer id) {
        // these 2 lines of code prepare the hibernate session for use
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();

        // JPA Query - the syntax is slightly different than regular SQL
        String hql = "SELECT o FROM Order o where o.id = :id";

        // this typed query is how hibernate knows what kind of object of fill up with the query results
        TypedQuery<Order> query = session.createQuery(hql,Order.class);

        // this is similar to the prepared statement, we are going to set the value in the query :firstname
        // to the value passed into the function
        query.setParameter("id", id);

        // we know we are querying a PK so the result will either be found or not found
        // unfortunately, in 2010 this implementation throws an exception if the record is not found
        // this does not exist in 2024
        try {
            Order result = query.getSingleResult();
            return result;
        } catch ( Exception e ) {
            return null;
        } finally {
            // finally we close the hibernate session so it can release the resources its holding
            // specifically the connection pool and close the transaction
            session.close();
        }

    }



    public List<Order> findByCustomerId(String customerId) {
        // these 2 lines of code prepare the hibernate session for use
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();

        // JPA Query - the syntax is slightly different than regular SQL
        // SQL - "select * from employees e where e.firstname = ?"
        String hql = "SELECT ci FROM Order ci where ci = :customerId";

        // this typed query is how hibernate knows what kind of object of fill up with the query results
        TypedQuery<Order> query = session.createQuery(hql,Order.class);

        // this is similar to the prepared statement, we are going to set the value in the query :firstname
        // to the value passed into the function
        query.setParameter("customerId", customerId);

        // when we know we are getting 0 or more records we use getResultList
        List<Order> result = query.getResultList();

        // finally we close the hibernate session so it can release the resources its holding
        // specifically the connection pool and close the transaction
        session.close();

        return result;
    }

    public List<Order> findByOrderDate(String orderdate) {
        // these 2 lines of code prepare the hibernate session for use
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();

        // JPA Query - the syntax is slightly different than regular SQL
        // SQL - "select * from employees e where e.lastname = ?"
        String hql = "SELECT o FROM Order o where o.orderDate= :orderdate";

        // this typed query is how hibernate knows what kind of object of fill up with the query results
        TypedQuery<Order> query = session.createQuery(hql,Order.class);

        // this is similar to the prepared statement, we are going to set the value in the query :lastname
        // to the value passed into the function
        query.setParameter("orderdate",orderdate);

        // when we know we are getting 0 or more records we use getResultList
        List<Order> result = query.getResultList();

        // finally we close the hibernate session so it can release the resources its holding
        // specifically the connection pool and close the transaction
        session.close();

        return result;
    }
}


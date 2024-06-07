
package org.example.database.dao;

import jakarta.persistence.TypedQuery;
import org.example.database.entity.Customer;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class CustomerDAO {


    public void insert(Customer customer) {
        // these 2 lines of code prepare the hibernate session for use
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();

        // begin the transaction
        session.getTransaction().begin();

        // insert the employee to the database
        session.save(customer);

        /// commit our transaction
        session.getTransaction().commit();

        // cleanup the session
        session.close();
    }

    public void update(Customer customer) {
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();
        session.getTransaction().begin();

        // this is the only line that changed
        session.merge(customer);

        session.getTransaction().commit();
        session.close();
    }

    public void delete(Customer customer) {
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();
        session.getTransaction().begin();

        // this is the only line that changed
        session.delete(customer);

        session.getTransaction().commit();
        session.close();
    }


    public Customer findById(Integer id) {
        // these 2 lines of code prepare the hibernate session for use
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();

        // JPA Query - the syntax is slightly different than regular SQL
        String hql = "SELECT c FROM Customer c WHERE c.id = :id";

        // this typed query is how hibernate knows what kind of object of fill up with the query results
        TypedQuery<Customer> query = session.createQuery(hql,Customer.class);

        // this is similar to the prepared statement, we are going to set the value in the query :firstname
        // to the value passed into the function
        query.setParameter("id", id);

        // we know we are querying a PK so the result will either be found or not found
        // unfortunately, in 2010 this implementation throws an exception if the record is not found
        // this does not exist in 2024
        try {
            Customer result = query.getSingleResult();
            return result;
        } catch ( Exception e ) {
            return null;
        } finally {
            // finally we close the hibernate session so it can release the resources its holding
            // specifically the connection pool and close the transaction
            session.close();
        }

    }



    public List<Customer> findByContactFirstName(String contactFirstName) {
        // these 2 lines of code prepare the hibernate session for use
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();

        // JPA Query - the syntax is slightly different than regular SQL
        // SQL - "select * from employees e where e.firstname = ?"
        String hql = "SELECT c FROM Customer c where c.contactFirstName = :firstname";

        // this typed query is how hibernate knows what kind of object of fill up with the query results
        TypedQuery<Customer> query = session.createQuery(hql,Customer.class);

        // this is similar to the prepared statement, we are going to set the value in the query :firstname
        // to the value passed into the function
        query.setParameter("firstname", contactFirstName);

        // when we know we are getting 0 or more records we use getResultList
        List<Customer> result = query.getResultList();

        // finally we close the hibernate session so it can release the resources its holding
        // specifically the connection pool and close the transaction
        session.close();

        return result;
    }

    public List<Customer> findByLastName(String lastName) {
        // these 2 lines of code prepare the hibernate session for use
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();

        // JPA Query - the syntax is slightly different than regular SQL
        // SQL - "select * from employees e where e.lastname = ?"
        String hql = "SELECT c FROM Customer c where c.contactLastName = :lastname";

        // this typed query is how hibernate knows what kind of object of fill up with the query results
        TypedQuery<Customer> query = session.createQuery(hql,Customer.class);

        // this is similar to the prepared statement, we are going to set the value in the query :lastname
        // to the value passed into the function
        query.setParameter("lastname", lastName);

        // when we know we are getting 0 or more records we use getResultList
        List<Customer> result = query.getResultList();

        // finally we close the hibernate session so it can release the resources its holding
        // specifically the connection pool and close the transaction
        session.close();

        return result;
    }
    public List<Customer> findByCustomerName(String customerName) {
        // these 2 lines of code prepare the hibernate session for use
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();

        // JPA Query - the syntax is slightly different than regular SQL
        // SQL - "select * from employees e where e.firstname = ?"
        String hql = "SELECT c FROM Customer c where c.customerName = :customer_name";

        // this typed query is how hibernate knows what kind of object of fill up with the query results
        TypedQuery<Customer> query = session.createQuery(hql, Customer.class);

        // this is similar to the prepared statement, we are going to set the value in the query :firstname
        // to the value passed into the function
        query.setParameter("customer_name", customerName);

        // when we know we are getting 0 or more records we use getResultList
        List<Customer> result = query.getResultList();

        // finally we close the hibernate session so it can release the resources its holding
        // specifically the connection pool and close the transaction
        session.close();

        return result;
    }




}
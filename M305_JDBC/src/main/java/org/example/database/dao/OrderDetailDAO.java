package org.example.database.dao;

import jakarta.persistence.NoResultException;
import jakarta.persistence.TypedQuery;
import org.example.database.entity.*;
import org.example.database.entity.Order;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class OrderDetailDAO {

    public void insert(OrderDetail orderDetail) {
        // these 2 lines of code prepare the hibernate session for use
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();

        // begin the transaction
        session.getTransaction().begin();

        // insert the employee to the database
        session.save(orderDetail);

        /// commit our transaction
        session.getTransaction().commit();

        // cleanup the session
        session.close();

    }



    public Order findById(Integer id) {

        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();


        String hql = "SELECT o FROM Order o where o.id = :id";

        TypedQuery<Order> query = session.createQuery(hql,Order.class);


        query.setParameter("id", id);



        try {
            Order result = query.getSingleResult();
            return result;
        } catch ( NoResultException e ) {
            return null;
        } finally {
            session.close();

        }
    }

    public List<Order> findByCustomerId(Integer customerId) {

        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();


        String hql = "SELECT o FROM Orders o where o.customerID = :customerId";

        TypedQuery<Order> query = session.createQuery(hql,Order.class);


        query.setParameter("customerId", customerId);

        List<Order> result = query.getResultList();


        session.close();

        return result;
    }

}
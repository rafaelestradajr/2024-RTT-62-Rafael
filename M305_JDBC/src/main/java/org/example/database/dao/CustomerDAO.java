package org.example.database.dao;

import jakarta.persistence.NoResultException;
import jakarta.persistence.TypedQuery;
import org.example.database.entity.Customer;
import org.example.database.entity.Order;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class CustomerDAO {

    public List<Customer> findByCustomerName(String customerName) {

        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();


        String hql = "SELECT c FROM Customer c where c.customerName = :customerName";

        TypedQuery<Customer> query = session.createQuery(hql, Customer.class);


        query.setParameter("customerName", customerName);

        List<Customer> result = query.getResultList();

        session.close();

        return result;

    }

    public List<Customer> findByContactFirstName(String contactFirstName) {

        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();


        String hql = "SELECT c FROM Customer c where c.contactFirstname = :contactFirstName";

        TypedQuery<Customer> query = session.createQuery(hql, Customer.class);


        query.setParameter("contactFirstName", contactFirstName);

        List<Customer> result = query.getResultList();

        session.close();

        return result;

    }

    public Customer findById(Integer id) {

        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();


        String hql = "SELECT c FROM Customer c where c.id = :id";

        TypedQuery<Customer> query = session.createQuery(hql, Customer.class);


        query.setParameter("id", id);


        try {
            Customer result = query.getSingleResult();
            return result;
        } catch (NoResultException e) {
            return null;
        } finally {
            session.close();
        }
    }

    public List<Customer> findByIdList(Integer id) {

        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();


        String hql = "SELECT c FROM Customer c where c.id = :id";

        TypedQuery<Customer> query = session.createQuery(hql, Customer.class);


        query.setParameter("id", id);


        List<Customer> result = query.getResultList();



        session.close();
        return result;
    }

    public void insert(Customer customer) {

        //first two lines of code begin the hibernate session
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

    public void update(Customer customers) {
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();
        session.getTransaction().begin();
        session.merge(customers);
        session.getTransaction().commit();
        session.close();
    }

    public void delete(Customer customers) {
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();
        session.getTransaction().begin();
        session.delete(customers);
        session.getTransaction().commit();
        session.close();
    }


}
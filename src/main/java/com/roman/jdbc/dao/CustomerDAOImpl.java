package com.roman.jdbc.dao;

import com.roman.jdbc.entity.Customer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public class CustomerDAOImpl implements CustomerDAO {

    @Autowired
    public SessionFactory sessionFactory;

    @Override
    public List<Customer> getCustomers() {
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("From Customer", Customer.class);
        return query.getResultList();
    }

    @Override
    public void saveCustomer(Customer customer){
        Session session = sessionFactory.getCurrentSession();
        session.save(customer);
    }

}
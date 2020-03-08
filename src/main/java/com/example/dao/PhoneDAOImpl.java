package com.example.dao;

import com.example.model.Phone;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import java.util.List;

@Repository
public class PhoneDAOImpl implements PhoneDAO {
    private SessionFactory sessionFactory;
    ProducerDAO producerDAO;

    @Autowired
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }


    @Override
    @SuppressWarnings("unchecked")
    public List<Phone> allPhones() {
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from phone order by id").list();
    }

    @Override
    public void add(Phone phone) {
        Session session = sessionFactory.getCurrentSession();
        session.save(phone);
    }

    @Override
    public void delete(Phone phone) {
        Session session = sessionFactory.getCurrentSession();
        session.delete(phone);
    }

    @Override
    public void edit(Phone phone) {
        Session session = sessionFactory.getCurrentSession();
        session.update(phone);
    }

    @Override
    public Phone getById(int id) {
        Session session = sessionFactory.getCurrentSession();
        return session.get(Phone.class, id);
    }
}

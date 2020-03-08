package com.example.dao;

import com.example.model.Producer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import java.util.List;


@Repository
public class ProducerDAOImpl implements ProducerDAO {
    private SessionFactory sessionFactory;

    @Autowired
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }


    @Override
    @SuppressWarnings("unchecked")
    public List<Producer> allProducers() {
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from producer ").list();
    }

    @Override
    public void edit(Producer producer) {
        Session session = sessionFactory.getCurrentSession();
        session.update(producer);
        System.out.println(producer);
    }

    @Override
    public Producer getById(int id) {
        Session session = sessionFactory.getCurrentSession();
        return session.get(Producer.class, id);
    }
}

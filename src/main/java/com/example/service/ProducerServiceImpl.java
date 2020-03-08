package com.example.service;


import com.example.dao.ProducerDAO;
import com.example.model.Producer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class ProducerServiceImpl implements ProducerService {

    private ProducerDAO ProducerDAO;

    @Autowired
    public void SetProducerDAO(ProducerDAO ProducerDAO) {
        this.ProducerDAO = ProducerDAO;
    }

    @Override
    @Transactional
    public List<Producer> allProducers() {
        return ProducerDAO.allProducers();
    }

    @Override
    @Transactional
    public Producer getById(int id) {
        return ProducerDAO.getById(id);
    }

    @Override
    @Transactional
    public void edit(Producer producer) {
        ProducerDAO.edit(producer);
    }

}

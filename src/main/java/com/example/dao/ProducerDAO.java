package com.example.dao;

import com.example.model.Producer;

import java.util.List;

public interface ProducerDAO {

    List<Producer> allProducers();

    void edit(Producer producer);

    Producer getById(int id);
}

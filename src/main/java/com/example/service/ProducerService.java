package com.example.service;

import com.example.model.Producer;

import javax.transaction.Transactional;
import java.util.List;

public interface ProducerService {

    @Transactional
    List<Producer> allProducers();

    @Transactional
    Producer getById(int id);

    @Transactional
    void edit(Producer producer);
}

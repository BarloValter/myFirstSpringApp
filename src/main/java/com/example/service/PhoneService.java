package com.example.service;

import com.example.model.Phone;

import javax.transaction.Transactional;
import java.util.List;


public interface PhoneService {

    List<Phone> allPhones();

    void add(Phone phone);

    void delete(Phone phone);

    void edit(Phone phone);

    Phone getById(int id);
}

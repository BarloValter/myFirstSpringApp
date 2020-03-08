package com.example.dao;

import com.example.model.Phone;

import java.util.List;

public interface PhoneDAO {

    List<Phone> allPhones();

    void add(Phone phone);

    void delete(Phone phone);

    void edit(Phone phone);

    Phone getById(int id);
}

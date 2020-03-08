package com.example.service;

import com.example.dao.PhoneDAO;
import com.example.model.Phone;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class PhoneServiceImpl implements PhoneService {

    private PhoneDAO PhoneDAO;

    @Autowired
    public void SetPhoneDAO(PhoneDAO phoneDAO) {
        this.PhoneDAO = phoneDAO;
    }

    @Override
    @Transactional
    public List<Phone> allPhones() {
        return PhoneDAO.allPhones();
    }

    @Override
    @Transactional
    public void add(Phone phone) {
        PhoneDAO.add(phone);
    }

    @Override
    @Transactional
    public void delete(Phone phone) {
        PhoneDAO.delete(phone);
    }

    @Override
    @Transactional
    public void edit(Phone phone) {
        PhoneDAO.edit(phone);
    }

    @Override
    @Transactional
    public Phone getById(int id) {
        return PhoneDAO.getById(id);
    }

}

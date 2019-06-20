package com.example.testproject;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ContactDetailService {


    public ContactDetail findByContactDetailId(int id);
    public List<ContactDetail> findAll();

}
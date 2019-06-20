package com.example.testproject;

import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

@Service
public interface ContactService  {


    public Page<Contact> findAll(Integer pageNo , Integer dataRange, String fieldname) ;
    public Contact findByUserId(int id);





}
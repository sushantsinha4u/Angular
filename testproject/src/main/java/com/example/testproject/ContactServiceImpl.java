package com.example.testproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;

@Component
public class ContactServiceImpl implements ContactService {

    @Autowired
    private ContactRepository repository;



    public Page<Contact> findAll(Integer pageNo , Integer dataRange, String fieldname) {
        Pageable pageable = PageRequest.of(pageNo, dataRange,  Sort.by(fieldname));
        return  repository.findAll(pageable);
    }

    public Contact findByUserId(int id) {
        return repository.findByUserId(id);
    }
}

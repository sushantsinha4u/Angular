package com.example.testproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
public class ContactDetailServiceImpl  implements  ContactDetailService{

    @Autowired
    private ContactDetailRepository contactDetailRepository;


    @Override
    public ContactDetail findByContactDetailId(int id) {
        return contactDetailRepository.findByContactDetailId(id);
    }



    @Override
    public List<ContactDetail> findAll() {
        return (List<ContactDetail>) contactDetailRepository.findAll();
    }

}
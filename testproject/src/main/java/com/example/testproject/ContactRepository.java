package com.example.testproject;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactRepository extends CrudRepository<Contact, String> {



    Contact findByUserId(int id);
    Page<Contact> findAll(Pageable pageable);

}
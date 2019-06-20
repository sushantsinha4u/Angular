package com.example.testproject;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ContactDetailRepository extends CrudRepository  <ContactDetail,String> {

    ContactDetail findByContactDetailId(int id);

}
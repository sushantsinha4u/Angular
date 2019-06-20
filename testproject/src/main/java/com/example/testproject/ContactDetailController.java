package com.example.testproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/contactdetail")
public class ContactDetailController {

    @Autowired
    private  final ContactDetailService contactDetailService;



    public ContactDetailController(ContactDetailService contactDetailService){
        this.contactDetailService=contactDetailService;
    }






    @GetMapping( value = "/")
    @ResponseBody
    public List<ContactDetail> findAll(){
        return contactDetailService.findAll();
    }




    @GetMapping(value = "/{id}")
    @ResponseBody
    public ContactDetail findOne(@PathVariable("id") int id)
    {
        System.out.println("  id ------>  "+id);
        return contactDetailService.findByContactDetailId(id);
    }

}

package com.example.testproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@RestController
@RequestMapping("/")
public class ContactController {

    @Autowired
    private  final ContactService contactService;



    public  ContactController(ContactService contactService){
        this.contactService=contactService;
    }



    @GetMapping(value = "/{id}")
    @ResponseBody
    public Contact findOne(@PathVariable("id") int id)
    {
        System.out.println("  id ------>  "+id);
        return contactService.findByUserId(id);
    }


    @RequestMapping( value = "/contacts")
    public ModelAndView findAll(Model model , @RequestParam("page") Optional<Integer> page,
                                @RequestParam("size") Optional<Integer> size,@RequestParam("fieldname") Optional<String> fieldname){

        System.out.println(" In findaAll   ");
        ModelAndView modelAndView=new ModelAndView();
        int currentPage = page.orElse(1);
        int pageSize = size.orElse(3);
        String sortFieldName= fieldname.orElse("name");

        Page<Contact> contacts = contactService.findAll(currentPage - 1, pageSize ,  sortFieldName);
        System.out.println("contacts ::     "+contacts);


        int totalPages = contacts.getTotalPages();
        System.out.println("totalPages ::  "+totalPages);

        if (totalPages > 0) {
            List<Integer> pageNumbers = IntStream.rangeClosed(1, totalPages)
                    .boxed()
                    .collect(Collectors.toList());

            System.out.println("pageNumbers ::  "+pageNumbers);

            model.addAttribute("pageNumbers", pageNumbers);
        }

        model.addAttribute("contacts",contacts);
        modelAndView.setViewName("contacts");
        return modelAndView;
    }



}

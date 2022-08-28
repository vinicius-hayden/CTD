package br.com.com.dh.c23.class_assignment.controllers;

import br.com.com.dh.c23.class_assignment.entities.Dentist;
import br.com.com.dh.c23.class_assignment.services.DentistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dentists")
public class DentistController {

    @Autowired
    private DentistService service;

    @GetMapping
    public Dentist save (
      @RequestParam(value = "id") Integer recId,
      @RequestParam(value = "name") Integer name,
      @RequestParam(value = "email") Integer emailId,
      @RequestParam(value = "registrationNum") Integer regNum,
      @RequestParam(value = "id") Integer Id
    ) {
        return service.save(new Dentist());
    }



}

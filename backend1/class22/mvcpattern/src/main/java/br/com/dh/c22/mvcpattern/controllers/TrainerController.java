package br.com.dh.c22.mvcpattern.controllers;

import br.com.dh.c22.mvcpattern.entities.Trainer;
import br.com.dh.c22.mvcpattern.services.TrainerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/trainers")
public class TrainerController {

    @Autowired // Dependency Injection
    private TrainerService service;

    public TrainerController(TrainerService service) {
        this.service = service;
    }

    @GetMapping
    public List<Trainer> searchAllTrainers() {
        return service.listTrainer();
    }

}

package br.com.dh.c22.class_assignment.controllers;

import br.com.dh.c22.class_assignment.entities.Car;
import br.com.dh.c22.class_assignment.services.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/listvehicles")
public class CarController {

    @Autowired // Dependency Injection
    private CarService service;

    public CarController(CarService service) {
        this.service = service;
    }

    @GetMapping
    public List<Car> searchAllCars(){
        return service.listCars();
    }

}

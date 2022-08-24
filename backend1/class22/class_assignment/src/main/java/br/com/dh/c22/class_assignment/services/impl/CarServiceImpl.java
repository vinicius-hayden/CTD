package br.com.dh.c22.class_assignment.services.impl;

import br.com.dh.c22.class_assignment.entities.Car;
import br.com.dh.c22.class_assignment.services.CarService;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    @Override
    public List<Car> listCars() {
        return Arrays.asList(
                new Car("Mercedes", "Black"),
                new Car("BMW", "Green"),
                new Car("Toyota", "White"),
                new Car("Hyundai", "White")
        );
    }
}

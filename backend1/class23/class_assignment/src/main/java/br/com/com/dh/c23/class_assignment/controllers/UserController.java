package br.com.com.dh.c23.class_assignment.controllers;

import br.com.com.dh.c23.class_assignment.entities.User;
import br.com.com.dh.c23.class_assignment.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService service;

    @GetMapping
    public User save(
            @RequestParam(value = "id") Integer idrec,
            @RequestParam(value = "name") String nomerec,
            @RequestParam(value = "email") String emailrec,
            @RequestParam(value = "password") String senharec,
            @RequestParam(value = "acesslevel") Integer nivelacessorec) {
        return service.save(new User(idrec, nomerec, emailrec, senharec, nivelacessorec));
    }

    @GetMapping("/search")
    public List<User> searchAll() {
        return service.searchAll();
    }

    @GetMapping("/{id}")
    public String delete(@PathVariable Integer id) {
        return service.delete(id);
    }

}


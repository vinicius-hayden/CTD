package br.com.dh.c22.mvcpattern.services.impl;

import br.com.dh.c22.mvcpattern.entities.Trainer;
import br.com.dh.c22.mvcpattern.services.TrainerService;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

    @Service
    public class TrainerServiceImpl implements TrainerService {

        @Override
        public List<Trainer> listTrainer() {
            return Arrays.asList(
                    new Trainer("Roger"),
                    new Trainer("Seth"),
                    new Trainer("Scott")
            );
        }
    }




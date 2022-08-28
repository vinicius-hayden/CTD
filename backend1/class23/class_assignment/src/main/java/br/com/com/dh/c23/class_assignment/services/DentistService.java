package br.com.com.dh.c23.class_assignment.services;

import br.com.com.dh.c23.class_assignment.entities.Dentist;
import br.com.com.dh.c23.class_assignment.entities.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class DentistService implements IDao<Dentist> {

    private static Map<Integer, Dentist> dentistMap = new HashMap<>();


    @Override
    public Dentist save(Dentist dentist) {
        dentistMap.put(dentist.getId(), dentist);
        return dentist;
    }

    @Override
    public List<Dentist> searchAll() {
        return new ArrayList<>(dentistMap.values());
    }

    @Override
    public String delete(Integer id) {
        dentistMap.remove(id);
        return "The register was removed";
    }
}


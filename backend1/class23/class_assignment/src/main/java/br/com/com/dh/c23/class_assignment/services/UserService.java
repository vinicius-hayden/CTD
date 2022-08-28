package br.com.com.dh.c23.class_assignment.services;

import br.com.com.dh.c23.class_assignment.entities.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class UserService implements IDao<User> {

    private static Map<Integer, User> users = new HashMap<>();

    @Override
    public User save(User user) {
        users.put(user.getId(), user);
        return user;
    }

    @Override
    public List<User> searchAll() {
        return new ArrayList<>(users.values());
    }

    @Override
    public String delete(Integer id) {
        users.remove(id);
        return "The register was removed";
    }
}

package br.com.com.dh.c23.class_assignment.services;

import java.util.List;

public interface IDao<T> {

    T save(T t);
    List<T> searchAll();
    String delete(Integer id);

}

package service;

import java.time.LocalDate;

public interface Vaccinate {

    void vaccinatePerson(String rg, LocalDate vaccineDate, String vaccineName);

}

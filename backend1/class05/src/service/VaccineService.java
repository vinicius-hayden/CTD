package service;

import java.time.LocalDate;

public class VaccineService implements Vaccinate{

    @Override
    public void vaccinatePerson(String rg, LocalDate vaccineDate, String vaccineName) {
        System.out.println("User" + rg + "vaccinated " + vaccineDate + "with success");
    }
}

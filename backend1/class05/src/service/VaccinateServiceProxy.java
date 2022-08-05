package service;

import java.time.LocalDate;

public class VaccinateServiceProxy implements Vaccinate {

    @Override
    public void vaccinatePerson(String rg, LocalDate vaccineDate, String vaccineName) {

        if (LocalDate.now().equals(vaccineDate)) {
            VaccineService vaccineService = new VaccineService();
            vaccineService.vaccinatePerson(rg, vaccineDate, vaccineName);
            System.out.println("Citizen liberated.");
        } else {
            System.out.println("Today's date is before the appointment date.");
        } // Ctrl + Alt + L = Indent.
    }
}

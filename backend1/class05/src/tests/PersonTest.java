package tests;

import entities.Person;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import service.Vaccinate;
import service.VaccinateServiceProxy;
import service.VaccineService;

import java.time.LocalDate;

public class PersonTest {

    LocalDate getGetVaccinateDateBefore, getVaccinateDateToday;
    Person p1, p2;

    @BeforeEach
    void doBefore() {
        getGetVaccinateDateBefore = LocalDate.now().minusDays(4);
        getVaccinateDateToday = LocalDate.now();

        p1 = new Person("Jonas", "Iglesias", "124632983", getGetVaccinateDateBefore, "Coronavacc");

        p2 = new Person("Marlon", "Brandon", "580588392", getVaccinateDateToday, "Pfizer");

    }

    @Test
    public void vac1() {
        Vaccinate vaccinate = new VaccinateServiceProxy();
        vaccinate.vaccinatePerson(p1.getRg(), p1.getVaccineDate(),p1.getVaccineName());
        System.out.println("p1");
        System.out.print("");
    }

    @Test
    public void vac2() {
        Vaccinate vaccinate = new VaccinateServiceProxy();
        vaccinate.vaccinatePerson(p2.getRg(), p2.getVaccineDate(),p2.getVaccineName());
        System.out.println("p2");
        System.out.print("");
    }


}

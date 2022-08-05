package entities;

import javax.xml.namespace.QName;
import java.time.LocalDate;

public class Person {

    private String name;
    private String lastname;
    private String rg;
    private LocalDate vaccineDate;
    private String vaccineName;

    public Person(String name, String lastname, String rg, LocalDate vaccineDate, String vaccineName) {
        this.name = name;
        this.lastname = lastname;
        this.rg = rg;
        this.vaccineDate = vaccineDate;
        this.vaccineName = vaccineName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public LocalDate getVaccineDate() {
        return vaccineDate;
    }

    public void setVaccineDate(LocalDate vaccineDate) {
        this.vaccineDate = vaccineDate;
    }

    public String getVaccineName() {
        return vaccineName;
    }

    public void setVaccineName(String vaccineName) {
        this.vaccineName = vaccineName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", rg='" + rg + '\'' +
                ", vaccineDate=" + vaccineDate +
                ", vaccineName='" + vaccineName + '\'' +
                '}';
    }
}

package entities;

import java.util.Date;

public class Administrative extends Employee{

    private String departament;

    public Administrative(String name, String gender, String jobPosition, double salary, Date birthdate, String departament) {
        super(name, gender, jobPosition, salary, birthdate);
        this.departament = departament;
    }

    public String getDepartament() {
        return departament;
    }

    public void setDepartament(String departament) {
        this.departament = departament;
    }

    @Override
    public String toString() {
        return "Administrative{" +
                "departament='" + departament + '\'' +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", jobPosition='" + jobPosition + '\'' +
                ", salary=" + salary +
                ", birthdate=" + birthdate +
                '}';
    }
}

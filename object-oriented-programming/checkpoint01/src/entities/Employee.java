package entities;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public abstract class Employee {

    protected String name;
    protected String gender;
    protected String jobPosition;
    protected double salary;
    protected Date birthdate;
    private List<Date> clockInList;

    public Employee(String name, String gender, String jobPosition, double salary, Date birthdate) {
        this.name = name;
        this.gender = gender;
        this.jobPosition = jobPosition;
        this.salary = salary;
        this.birthdate = birthdate;
        this.clockInList = new LinkedList<Date>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getJobPosition() {
        return jobPosition;
    }

    public void setJobPosition(String jobPosition) {
        this.jobPosition = jobPosition;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    // Methods

    public Date clockIn() {
        Date now = new Date();
        this.clockInList.add(now);
        return now;
    }

    public void clockInReport() {
        for (Date clockIn: this.clockInList) {
            System.out.println(clockIn);
        };
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", jobPosition='" + jobPosition + '\'' +
                ", salary=" + salary +
                ", birthdate=" + birthdate +
                ", clockInList=" + clockInList +
                '}';
    }
}


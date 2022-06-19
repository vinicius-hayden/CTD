package entities;

import entities.exception.InvalidDataException;

import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public abstract class Employee {

    protected String name;
    protected String gender;
    protected String jobPosition;
    protected double salary;
    protected Date birthdate;
    private final List<Date> clockInList;

    public Employee(String name, String gender, String jobPosition, double salary, Date birthdate) throws InvalidDataException {
        this.name = name;
        this.gender = gender;
        this.jobPosition = jobPosition;
        this.salary = salary;
        this.birthdate = birthdate;
        this.clockInList = new LinkedList<Date>();
        this.validateInputs();
    }

    protected void validateInputs() throws InvalidDataException {
        if (this.name == null || this.name.trim().length() == 0) {
            throw new InvalidDataException("Invalid name.");
        } else if (this.gender == null || !(this.gender.equals("M") || this.gender.equals("F"))) {
            throw new InvalidDataException("Invalid Gender. Should be F or M");
        } else if (this.jobPosition == null || this.jobPosition.trim().length() == 0) {
            throw new InvalidDataException("Invalid job position");
        } else if (this.salary <= 0 || this.salary > 10000.00) {
            throw new InvalidDataException("Invalid salary. Should be greater than zero and less then 10.000");
        } else if (calculateAge(this.birthdate) < 18) {
            throw new InvalidDataException("Invalid Age. Should be older than 18 years old");
        }

    }

    // Encapsulation
    private int calculateAge(Date birthdate) {
        LocalDate date = birthdate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        if (date == null) {
            return 0;
        }
        return Period.between(date, LocalDate.now()).getYears();
    }

    public String getName() {
        return name;
    }


    public String getGender() {
        return gender;
    }

    public String getJobPosition() {
        return jobPosition;
    }

    public double getSalary() {
        return salary;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    // Methods

    public abstract double bonusSalary();

    // Encapsulation
    public Date clockIn() {
        Date now = new Date();
        this.clockInList.add(now);
        return now;
    }

    public void clockInReport() {
        for (Date clockIn : this.clockInList) {
            System.out.println(clockIn);
        }
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


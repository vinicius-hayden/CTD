package entities;

import entities.exception.InvalidDataException;

import java.util.Date;

public class Administrative extends Employee{

    private String department;

    public Administrative(String name, String gender, String jobPosition, double salary, Date birthdate, String department) throws InvalidDataException {
        super(name, gender, jobPosition, salary, birthdate);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }
    @Override
    protected void validateInputs() throws InvalidDataException {
        super.validateInputs();
        if (this.department == null || this.department.trim().length() == 0) {
            throw new InvalidDataException("Invalid department name.");
        }
    }

    @Override
    public double bonusSalary() {
        // 0.8 = 80%
        return getSalary() * 0.8;
    }

    @Override
    public String toString() {
        return "Administrative{" +
                "department='" + department + '\'' +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", jobPosition='" + jobPosition + '\'' +
                ", salary=" + salary +
                ", birthdate=" + birthdate +
                '}';
    }
}

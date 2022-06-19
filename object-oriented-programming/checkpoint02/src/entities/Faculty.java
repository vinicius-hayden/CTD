package entities;

import entities.exception.InvalidDataException;

import java.util.Date;

public class Faculty extends Employee {

    private String teachingForLevel;
    private final Subject subject;

    public Faculty(String name, String gender, String jobPosition, double salary, Date birthdate, String teachingForLevel, Subject subject) throws InvalidDataException {
        super(name, gender, jobPosition, salary, birthdate);
        this.teachingForLevel = teachingForLevel;
        this.subject = subject;
        this.subject.setFaculty(this);
    }

    public String getTeachingForLevel() {
        return teachingForLevel;
    }

    public Subject getSubject() {
        return subject;
    }

    @Override
    protected void validateInputs() throws InvalidDataException {
        super.validateInputs();
        if (this.teachingForLevel == null || this.teachingForLevel.trim().length() == 0) {
            throw new InvalidDataException("Invalid teaching level.");
        }
    }

    @Override
    public double bonusSalary() {
        // 0.85 = 85%
        return getSalary() * 0.85;
    }

    @Override
    public String toString() {
        return "Faculty{" +
                "teachingForLevel='" + teachingForLevel + '\'' +
                ", subject=" + subject.getName() +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", jobPosition='" + jobPosition + '\'' +
                ", salary=" + salary +
                ", birthdate=" + birthdate +
                '}';
    }
}

package entities;

import entities.exception.InvalidDataException;

import java.util.LinkedList;
import java.util.List;

public class Student {

    protected String name;
    protected List<Double> semesterGrades;

    public Student(String name) throws InvalidDataException {
        this.name = name;
        this.semesterGrades = new LinkedList<Double>();
        this.validateInputs();
    }

    private void validateInputs() throws InvalidDataException {
        if (this.name == null || this.name.trim().length() == 0) {
            throw new InvalidDataException("Invalid student name.");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Double> getSemesterGrades() {
        return semesterGrades;
    }

    //Methods

    public void addGrade(Double grade) throws InvalidDataException {
        if(grade < 0 || grade > 10) {
            throw new InvalidDataException("Grade should be within 0 and 10");
        }
        this.semesterGrades.add(grade);
    }

    public double getAverageGrade() {
        double sum = 0;
        for (double grade: this.semesterGrades) {
            sum += grade;
        }
       return sum/this.semesterGrades.size();
    }

    public boolean isApproved() {
        if (getAverageGrade() >= 6.0) {
            return true;
        } else {
            return false;
        }

    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", semesterGrades=" + semesterGrades +
                '}';
    }
}

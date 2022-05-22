package entities;

import java.util.LinkedList;
import java.util.List;

public class Student {

    protected String name;
    protected List<Double> semesterGrades;

    public Student(String name) {
        this.name = name;
        this.semesterGrades = new LinkedList<Double>();
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

    public void addGrade(Double grade) {
        this.semesterGrades.add(grade);
    }

    public boolean isApproved() {
        double sum = 0;
        for (double grade: this.semesterGrades) {
            sum += grade;
        }
       double avgGrade = sum/this.semesterGrades.size();

        if (avgGrade >= 6.0) {
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

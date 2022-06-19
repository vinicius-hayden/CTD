package entities;

import entities.exception.InvalidDataException;

import java.util.LinkedList;
import java.util.List;

public class Classroom {

    private final String gradeDescription;
    private final List<Subject> subjects;
    private final List<Student> students;

    public Classroom(String gradeDescription) throws InvalidDataException {
        this.gradeDescription = gradeDescription;
        this.subjects = new LinkedList<Subject>();
        this.students = new LinkedList<Student>();
        this.validateInputs();
    }

    private void validateInputs() throws InvalidDataException {
        if (this.gradeDescription == null || this.gradeDescription.trim().length() == 0) {
            throw new InvalidDataException("Invalid grade description.");
        }
    }

    public String getGradeDescription() {
        return gradeDescription;
    }

    // Overload
    public void add(Subject subject) {
        subjects.add(subject);
    }

    public List<Subject> getSubjects() {
        return subjects;
    }

    // Overload
    public void add(Student student) {
        students.add(student);
    }

    public List<Student> getStudents() {
        return students;
    }

    @Override
    public String toString() {
        return "Classroom{" +
                "gradeDescription='" + gradeDescription + '\'' +
                ", subjects=" + subjects +
                ", students=" + students +
                '}';
    }
}

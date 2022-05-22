package entities;

import java.util.LinkedList;
import java.util.List;

public class Classroom {

    private final String gradeDescription;
    private final List<Subject> subjects;
    private final List<Student> students;

    public Classroom(String gradeDescription) {
        this.gradeDescription = gradeDescription;
        this.subjects = new LinkedList<Subject>();
        this.students = new LinkedList<Student>();
    }

    public String getGradeDescription() {
        return gradeDescription;
    }

    public void add(Subject subject) {
        subjects.add(subject);
    }

    public List<Subject> getSubjects() {
        return subjects;
    }

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

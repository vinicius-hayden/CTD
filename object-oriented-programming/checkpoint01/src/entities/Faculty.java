package entities;

import java.util.Date;

public class Faculty extends Employee {

    private String teachingForLevel;
    private final Subject subject;

    public Faculty(String name, String gender, String jobPosition, double salary, Date birthdate, String teachingForLevel, Subject subject) {
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

    public void setTeachingForLevel(String teachingForLevel) {
        this.teachingForLevel = teachingForLevel;
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

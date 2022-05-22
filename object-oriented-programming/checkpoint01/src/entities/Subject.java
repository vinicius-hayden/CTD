package entities;

public class Subject {

    private String name;
    private String studyField;
    private Faculty faculty;

    public Subject(String name, String studyField) {
        this.name = name;
        this.studyField = studyField;
    }

    public Faculty getFaculty() {
        return faculty;
    }

    public void setFaculty(Faculty faculty) {
        this.faculty = faculty;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStudyField() {
        return studyField;
    }

    public void setStudyField(String studyField) {
        this.studyField = studyField;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "name='" + name + '\'' +
                ", studyField='" + studyField + '\'' +
                ", faculty=" + faculty.getName() +
                '}';
    }
}

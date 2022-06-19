package entities;

import entities.exception.InvalidDataException;

public class Subject {

    private String name;
    private String studyField;
    private Faculty faculty;

    public Subject(String name, String studyField) throws InvalidDataException {
        this.name = name;
        this.studyField = studyField;
        this.validateInputs();
    }

    private void validateInputs() throws InvalidDataException {
        if (this.name == null || this.name.trim().length() == 0) {
            throw new InvalidDataException("Invalid subject name.");
        } else if (this.studyField == null || this.studyField.trim().length() == 0) {
            throw new InvalidDataException("Invalid study field.");
        }
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

import entities.*;
import entities.exception.InvalidDataException;
import exception.UnexpectedException;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.util.Date;
import java.util.Scanner;

public class Program {


    public static void main(String[] args) {

        try {
            Scanner gets = new Scanner(System.in);
            System.out.print("Please, type the name of the student: ");
            String studentName = gets.nextLine();
            Student student = new Student(studentName);
            System.out.println("Type your semester grades");

            for (int i = 1; i <= 2; i++) {
                System.out.print("Grade no. " + i + ": ");
                double grade = gets.nextDouble();
                student.addGrade(grade);
            }

            System.out.println("Your grades: " + student.getSemesterGrades());
            System.out.println("Your semester grade average is " + student.getAverageGrade());

            if (student.isApproved()) {
                System.out.println("Congratulations, you've been approved!");
            } else {
                System.out.println("Good luck next time");
            }


        } catch (InvalidDataException e) {
            System.err.println(e.toString());
        } catch (Exception e) {
            System.err.println("Unexpected exception: " + e.toString());
        }

    }

    private static Date stringToDate(String dateAsString) {

        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        try {
            return dateFormat.parse(dateAsString);
        } catch (ParseException e) {
            throw new UnexpectedException("Unexpected exception while converting data: " + e.getMessage());
        }

    }

    // This method's purpose is entity validation only

    private static void validateModel() throws InterruptedException, InvalidDataException {
        // Employee Administrative Class
        Date birthdate = stringToDate("1970-03-27");
        Employee libraryEmployee = new Administrative("John Smith", "M", "School Library Director", 2000, birthdate, "Library");
        System.out.println(libraryEmployee);

        birthdate = stringToDate("1965-07-15");
        Employee schoolPrincipal = new Administrative("Pam Olive", "F", "School Principal", 10000, birthdate, "School Management");
        System.out.println(schoolPrincipal);

        birthdate = stringToDate("1995-12-06");
        Employee humanResourcesEmployee = new Administrative("Lily Nakamura", "F", "HR Director", 5000, birthdate, "Human Resources");
        System.out.println(humanResourcesEmployee);

        //Subject Class
        Subject biology = new Subject("Biology", "Science");
        Subject math = new Subject("Math", "STEM");
        Subject physics = new Subject("Physics", "STEM");

        // Employee Faculty Class
        birthdate = stringToDate("1982-01-05");
        Employee biologyTeacher = new Faculty("Henry Richard", "M", "Teacher", 2500.00, birthdate, "High-school", biology);
        System.out.println(biologyTeacher);

        birthdate = stringToDate("1992-05-10");
        Employee mathTeacher = new Faculty("Ada Lovelace", "F", "Teacher", 2500.00, birthdate, "Elementary School", math);
        System.out.println(mathTeacher);

        birthdate = stringToDate("1986-06-25");
        Employee physicsTeacher = new Faculty("Sean Miller", "M", "Teacher", 2500.00, birthdate, "High-school", physics);
        System.out.println(physicsTeacher);

        //Employee Methods
        libraryEmployee.clockIn();
        Thread.sleep(1000);
        libraryEmployee.clockIn();
        libraryEmployee.clockInReport();

        // Student Class
        Student student1 = new Student("John Smith");
        Student student2 = new Student("Sponge Bob");
        Student student3 = new Student("Mary Winkler");

        // Student Methods
        student2.addGrade(6.0);
        student2.addGrade(5.0);
        System.out.println(student2);
        if (student2.isApproved()) {
            System.out.println("Congratulations, you've been approved!");
        } else {
            System.out.println("Good luck next time");
        }

        // Classroom Class
        Classroom eleventhGrade = new Classroom("11th A");
        Classroom tenthGrade = new Classroom("10th B");
        Classroom ninthGrade = new Classroom("9th A");

        // Classroom Methods
        eleventhGrade.add(student1);
        tenthGrade.add(student2);
        ninthGrade.add(student3);
        eleventhGrade.add(biology);
        ninthGrade.add(math);
        tenthGrade.add(physics);

        System.out.println(eleventhGrade);
        System.out.println(tenthGrade);
        System.out.println(ninthGrade);

    }

}

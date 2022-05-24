import entities.*;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.util.Date;

public class Program {

    private static Date stringToDate(String dateAsString) throws ParseException {

        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        return dateFormat.parse(dateAsString);

    }

    public static void main(String[] args) throws InterruptedException, ParseException {
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

        //Student Methods
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

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
        // Employee class test
        Date birthdate = stringToDate("1970-03-27");
        Employee libraryEmployee = new Administrative("John Smith", "M", "CEO", 5000, birthdate, "Library");
        System.out.println(libraryEmployee);

        libraryEmployee.clockIn();
        Thread.sleep(1000);
        libraryEmployee.clockIn();
        libraryEmployee.clockInReport();

        Subject biology = new Subject("Biology", "Science");
        birthdate = stringToDate("1982-01-05");
        Employee biologyTeacher = new Faculty("Henry Richard", "M", "Teacher", 2500.00, birthdate, "High-school", biology);
        System.out.println(biologyTeacher);
        birthdate = stringToDate("1992-05-10");
        Subject math = new Subject("Math", "STEM");
        Employee mathTeacher = new Faculty("Ada Lovelace", "F", "Teacher", 2500.00, birthdate, "Elementary School", math);
        System.out.println(mathTeacher);

        Student student1 = new Student("John Smith");
        Student student2 = new Student("Sponge Bob");
        Student student3 = new Student("Mary Winkler");

        student2.addGrade(6.0);
        student2.addGrade(5.0);
        System.out.println(student2);
        if (student2.isApproved()) {
            System.out.println("Congratulations, you've been approved!");
        } else {
            System.out.println("Good luck next time");
        }

        Classroom eleventhGrade = new Classroom("11th A");
        eleventhGrade.add(student1);
        eleventhGrade.add(student2);
        eleventhGrade.add(student3);
        eleventhGrade.add(biology);
        eleventhGrade.add(math);

        System.out.println(eleventhGrade);


    }

}

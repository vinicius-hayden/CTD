import entities.*;

import java.util.Calendar;

import java.util.Date;

public class Program {

    public static void main(String[] args) throws InterruptedException {
        // Employee class test
        Employee libraryEmployee = new Administrative("John Smith", "M", "CEO", 5000, new Date(1, Calendar.JUNE, 15), "Library");

        libraryEmployee.clockIn();
        Thread.sleep(1000);
        libraryEmployee.clockIn();
        libraryEmployee.clockInReport();

        Subject biology = new Subject("Biology", "Science");
        Employee biologyTeacher = new Faculty("Henry Richard", "M", "Teacher", 2500.00, new Date(1982-1900, Calendar.JANUARY, 5), "High-school", biology);
        System.out.println(biologyTeacher);

        Subject math = new Subject("Math", "STEM");
        Employee mathTeacher = new Faculty("Ada Lovelace", "F", "Teacher", 2500.00, new Date(1992-1900, Calendar.MAY, 28), "Elementary School", math);
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

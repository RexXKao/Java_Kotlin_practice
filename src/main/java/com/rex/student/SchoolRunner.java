package com.rex.student;

import java.util.Scanner;

public class SchoolRunner {
    public static void main(String[] args) {
        System.out.println("Please enter student's name: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.println("Please enter student's english: ");
        int english = scanner.nextInt();
        System.out.println("Please enter student's math: ");
        int math = scanner.nextInt();
        Student stu = new Student(name, english, math);
        stu.print();

        /*Student stu = new Student("Rex", 60, 77);
        stu.print();*/
    }
}

package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Student student1 = new Student("Sriram", "Anne",
                "13003398", "Signal Processing", "Nadiridinna");

        Student student2 = new Student("Akhila", "Muppavarapu",
                "13003120", "Software Engineering", "Prashant");

        System.out.println("Student 1:");
        System.out.println(student1.displayDetails());
        System.out.println("Student 2:");
        System.out.println(student2.displayDetails());

        Teacher teacher1 = new Teacher("Nadiridinna", "K",
                "Signal Processing", 100000);

        Teacher teacher2 = new Teacher("Prashant","Yalla",
                "Software Engineering", 150000);

        System.out.println("Teacher 1:");
        System.out.println(teacher1.displayDetails());
        System.out.println("Teacher 2:");
        System.out.println(teacher2.displayDetails());

    }
}

package com.thilaka.mosh.java.fundamentals.part.one.b.types;

import java.util.Scanner;

public class R_Reading_Input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Age: ");
        byte age = scanner.nextByte();//you can also call next float or next Int
        System.out.println("You are " + age);
        /**
         * ========== Output ============
         * Age: 37
         * You are 37
         */

        System.out.print("Full Name: ");
        String firstName = scanner.next(); //next method reads next tokens (space separated
        String lastName = scanner.next();
        System.out.println("FirstName: " + firstName + " LastName: "+ lastName);

        scanner.nextLine(); //this nextLine is to finish reading the previous line and come to next line

        System.out.print("Full Name: ");
        String fullName = scanner.nextLine(); // nextLine reads the entire line, from the current cursor
        System.out.println("FullName: " + fullName);

        /**
         * ========== OUTPUT =============
         * Age: 37
         * You are 37
         * Full Name: Thilaka Vijayan
         * FirstName: Thilaka LastName: Vijayan
         * Full Name: Thilaka Vijayan
         * FullName: Thilaka Vijayan
         */
    }
}

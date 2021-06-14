package com.thilaka.mosh.java.fundamentals.part.one.c.control.flow;

import java.util.Scanner;

public class G_Exercise_FizzBuzz {
    public static void main(String[] args) {
        System.out.print("Number: ");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        if(input % 15 == 0) // the most specific condition at the top
            System.out.println("FizzBuzz");
        else if (input % 5 == 0)
            System.out.println("Fizz");
        else if (input % 3 == 0)
            System.out.println("Buzz");
        else // the most generic one at the bottom
            System.out.println(input);
    }

    public static void anotherImplementation(){ //but hard to read
        System.out.print("Number: ");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        if(input % 5 == 0) {
            if (input % 3 == 0)
                System.out.println("FizzBuzz");
            else
                System.out.println("Fizz");
        }
        else if (input % 3 == 0)
            System.out.println("Buzz");
        else // the most generic one at the bottom
            System.out.println(input);
    }
}

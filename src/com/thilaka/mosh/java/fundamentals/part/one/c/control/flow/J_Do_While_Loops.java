package com.thilaka.mosh.java.fundamentals.part.one.c.control.flow;

import java.util.Scanner;

public class J_Do_While_Loops {
    public static void main(String[] args) {
        String input = "";
        Scanner scanner = new Scanner(System.in);
       do{ // the block of code is executed at least once, in contrast with while loop, where the condition is checked
           // first and there is a chance the block of code is not executed at all.
            System.out.print("Input: ");
            input = scanner.next().toLowerCase();
            System.out.println(input);
        } while(!"quit".equals(input));
    }
}

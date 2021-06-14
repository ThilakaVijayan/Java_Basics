package com.thilaka.mosh.java.fundamentals.part.one.c.control.flow;

import java.util.Scanner;

public class I_While_Loops {
    public static void main(String[] args) {
        int i = 5;
        while(i > 0){
            System.out.println("Hello World " + i);
            i--;
        }
        /** ===== OUTPUT ======
         * Hello World 5
         * Hello World 4
         * Hello World 3
         * Hello World 2
         * Hello World 1
         */

        String input = "";
        Scanner scanner = new Scanner(System.in);
        while(!"quit".equals(input)){
            System.out.print("Input: ");
            input = scanner.next().toLowerCase();
            System.out.println(input);
        }
        /** ===== OUTPUT ======
         * Input: 1
         * 1
         * Input: 2
         * 2
         * Input: 3
         * 3
         * Input: quit
         * quit
         */
    }
}

package com.thilaka.mosh.java.fundamentals.part.one.c.control.flow;

public class H_For_Loops {
    public static void main(String[] args) {
        for(int i = 0; i < 5; i++)
            System.out.println("Hello World " + i);
        /** ======= OUTPUT ==========
         * Hello World 0
         * Hello World 1
         * Hello World 2
         * Hello World 3
         * Hello World 4
         */

        for(int i = 1; i <= 5; i++)
            System.out.println("Hello World " + i);
        /** ======= OUTPUT ==========
         * Hello World 1
         * Hello World 2
         * Hello World 3
         * Hello World 4
         * Hello World 5
         */

        for(int i = 5; i > 0; i--)
            System.out.println("Hello World " + i);
        /** ======= OUTPUT ==========
         * Hello World 5
         * Hello World 5
         * Hello World 4
         * Hello World 3
         * Hello World 2
         * Hello World 1
         */
    }
}

package com.thilaka.mosh.java.fundamentals.part.one.c.control.flow;

public class C_If_Statements {
    public static void main(String[] args) {
        int temp = 32;
        if (temp > 30){
            System.out.println("It's a hot day");
            System.out.println("Drink plenty of water");
        }
        else if (temp > 20)//(temp > 20 && temp <= 30)
            System.out.println("Beautiful day");
        else
            System.out.println("Cold day");

        /**
         * ====== OUTPUT ========
         * It's a hot day
         * Drink plenty of water
         */
    }
}

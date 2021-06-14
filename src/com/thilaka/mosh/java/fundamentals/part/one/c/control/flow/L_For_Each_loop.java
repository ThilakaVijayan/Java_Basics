package com.thilaka.mosh.java.fundamentals.part.one.c.control.flow;

public class L_For_Each_loop {
    public static void main(String[] args) {
        withoutForEachLoop();
        withForEachLoop();
    }

    public static void withoutForEachLoop(){
        String[] fruits = {"Apple", "Mango", "Orange"};

        for(int i = 0; i < fruits.length; i++){
            System.out.println(fruits[i]);
        }
        /**
         * ===== OUTPUT =======
         * Apple
         * Mango
         * Orange
         */
    }
    public static void withForEachLoop(){
        String[] fruits = {"Apple", "Mango", "Orange"};

        for(String fruit: fruits){ //limitation - we cant iterate backwards
            System.out.println(fruit);
        }
        /**
         * ===== OUTPUT =======
         * Apple
         * Mango
         * Orange
         */
    }
}

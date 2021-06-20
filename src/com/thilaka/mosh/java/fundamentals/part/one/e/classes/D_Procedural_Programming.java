package com.thilaka.mosh.java.fundamentals.part.one.e.classes;

public class D_Procedural_Programming {
    public static void main(String[] args) {
        int baseSalary = 50_000;
        int extraHours = 10;
        int hourlyRate = 20;

        int wage = calculateWage(baseSalary,extraHours,hourlyRate);
        System.out.println(wage);//50200
    }

    public  static int calculateWage(int baseSalary, int extraHours, int hourlyRate){
        return baseSalary + (extraHours * hourlyRate);
    }
    /**
     * This is procedural style of programming.
     * With this style of code, if we extend this program, if we add more features to it,
     * we will end up with very fat main method. Our main method is going to be get bloated with so many lines of code.
     *
     * Symptoms of code written in procedural style:
     * 1. You will end up with methods that have so many parameters.
     * 2. cannot be reused, have to copy certain lines of code to write a similar method.
     * 3. Spaghetti code.
     */
}

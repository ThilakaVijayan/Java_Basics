package com.thilaka.mosh.java.fundamentals.part.one.c.control.flow;

public class E_Ternary_Operator {
    public static void main(String[] args) {
        amateurWayOfCoding();
        firstImprovement();
        professionalWayOfCoding();
    }

    public static void amateurWayOfCoding(){
        int income = 120_000;
        String className;
        if(income > 100_000)
            className = "First";
        else
            className = "Economy";
    }

    public static void firstImprovement(){
        int income = 120_000;
        String className = "Economy";
        if(income > 100_000)
            className = "First";
    }

    public static void professionalWayOfCoding(){
        int income = 120_000;
        String className = income > 100_000 ? "First" : "Economy";
    }
}

package com.thilaka.mosh.java.fundamentals.part.one.c.control.flow;

public class D_Simplifying_If_Statements {
    public static void main(String[] args) {
        amateurWayOfCoding();
        firstImprovement();
        professionalWayOfCoding();
        moshWayOfCoding();
    }

    public static void amateurWayOfCoding(){
        int income = 120_000;
        boolean hasHighIncome;
        if (income > 100_000)
            hasHighIncome = true;
        else
            hasHighIncome = false;
    }

    public static void firstImprovement(){
        int income = 120_000;
        boolean hasHighIncome = false;
        if (income > 100_000)
            hasHighIncome = true;
    }

    public static void professionalWayOfCoding(){
        int income = 120_000;
        boolean hasHighIncome = income > 100_000;
    }

    public static void moshWayOfCoding(){
        int income = 120_000;
        boolean hasHighIncome = (income > 100_000);
    }

}

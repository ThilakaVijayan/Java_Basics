package com.thilaka.mosh.java.fundamentals.part.one.c.control.flow;

public class B_Logical_Operators {
    public static void main(String[] args) {
        int temperature = 22;
        boolean isWarm = temperature > 20 && temperature < 30;
        System.out.println(isWarm);//true

        temperature = 12;
        isWarm = temperature > 20 && temperature < 30;
        System.out.println(isWarm);//false

        boolean hasHighIncome = false;
        boolean hasGoodCredit = true;
        boolean hasCriminalRecord = false;
        boolean isEligible = (hasHighIncome || hasGoodCredit) && !hasCriminalRecord;
        System.out.println(isEligible);//true

    }
}

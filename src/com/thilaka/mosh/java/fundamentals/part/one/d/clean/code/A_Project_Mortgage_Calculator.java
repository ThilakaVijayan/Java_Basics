package com.thilaka.mosh.java.fundamentals.part.one.d.clean.code;

import java.text.NumberFormat;
import java.util.Scanner;

public class A_Project_Mortgage_Calculator {

    public static void main(String[] args) {
        int principle = (int) readNumber("Principal ($1k - $1M)", 1000, 1_000_000);
        float annualInterest = (float) readNumber("Annual Interest Rate", 1, 30);
        byte years = (byte) readNumber("Period (Years)", 1, 30);

        double mortgage = calculateMortgage(principle, annualInterest, years);
        System.out.println("Mortgage: " + NumberFormat.getCurrencyInstance().format(mortgage));
    }

    public static double readNumber(String prompt, double min, double max) {
        Scanner scanner = new Scanner(System.in);
        double value;
        while (true) {
            System.out.print(prompt + ": ");
            value = scanner.nextFloat();
            if (value >= min && value <= max)
                return value;
            System.out.println("Enter a value between " + min + " and " + max);
        }
    }

    public static double calculateMortgage(int principle, float annualInterest, byte years) {
        final int MONTHS_IN_YEAR = 12;
        final int PERCENT = 100;

        float monthlyInterest = annualInterest / (PERCENT * MONTHS_IN_YEAR);
        short numberOfPayment = (short) (years * (byte) MONTHS_IN_YEAR);
        double mortgageNumerator = principle * monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayment);
        double mortgageDenominator = Math.pow(1 + monthlyInterest, numberOfPayment) - 1;
        return mortgageNumerator / mortgageDenominator;
    }

    /**
     * ===== OUTPUT =======
     * Principal ($1k - $1M): 1000
     * Annual Interest Rate: 0
     * Enter a value between 1.0 and 30.0
     * Annual Interest Rate: 31
     * Enter a value between 1.0 and 30.0
     * Annual Interest Rate: 2
     * Period (Years): 0
     * Enter a value between 1.0 and 30.0
     * Period (Years): 31
     * Enter a value between 1.0 and 30.0
     * Period (Years): 2
     * Mortgage: $42.54
     */
}

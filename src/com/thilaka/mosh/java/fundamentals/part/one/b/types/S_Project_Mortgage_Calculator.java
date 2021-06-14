package com.thilaka.mosh.java.fundamentals.part.one.b.types;

import java.text.NumberFormat;
import java.util.Scanner;

public class S_Project_Mortgage_Calculator {



    public static void main(String[] args) {
        final int MONTHS_IN_YEAR = 12;
        final int PERCENT = 100;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Principal: ");
        long principle = scanner.nextLong();

        System.out.print("Annual Interest Rate: ");
        float interest = scanner.nextFloat();
        float monthlyInterest = interest / (PERCENT * MONTHS_IN_YEAR);

        System.out.print("Period (Years): ");
        byte years = scanner.nextByte();
        short numberOfPayment = (short) (years * (byte) MONTHS_IN_YEAR);

        double mortgageNumerator = principle * monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayment);
        double mortgageDenominator = Math.pow(1 + monthlyInterest, numberOfPayment) - 1;
        double mortgage = mortgageNumerator / mortgageDenominator;

        System.out.println("Mortgage: " + NumberFormat.getCurrencyInstance().format(mortgage));

    }
}

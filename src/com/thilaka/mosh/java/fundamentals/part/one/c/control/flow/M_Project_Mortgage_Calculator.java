package com.thilaka.mosh.java.fundamentals.part.one.c.control.flow;

import java.text.NumberFormat;
import java.util.Scanner;

public class M_Project_Mortgage_Calculator {



    public static void main(String[] args) {
        mySolution();
        moshSolution();

    }

    public static void mySolution(){
        final int MONTHS_IN_YEAR = 12;
        final int PERCENT = 100;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Principal ($1k - $1M): ");
        long principle = scanner.nextLong();
        while(principle < 1000 || principle > 1_000_000){
            System.out.println("Enter a number between 1,000 and 1,000,000.");
            System.out.print("Principal ($1k - $1M): ");
            principle = scanner.nextLong();
        }

        System.out.print("Annual Interest Rate: ");
        float interest = scanner.nextFloat();
        while(interest <= 0 || interest > 30){
            System.out.println("Enter a value greater than 0 and less than or equal to 30.");
            System.out.print("Annual Interest Rate: ");
            interest = scanner.nextFloat();
        }
        float monthlyInterest = interest / (PERCENT * MONTHS_IN_YEAR);

        System.out.print("Period (Years): ");
        byte years = scanner.nextByte();
        while(years < 1 || years > 30){
            System.out.println("Enter a value between 1 and 30.");
            System.out.print("Period (Years): ");
            years = scanner.nextByte();
        }
        short numberOfPayment = (short) (years * (byte) MONTHS_IN_YEAR);

        double mortgageNumerator = principle * monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayment);
        double mortgageDenominator = Math.pow(1 + monthlyInterest, numberOfPayment) - 1;
        double mortgage = mortgageNumerator / mortgageDenominator;

        System.out.println("Mortgage: " + NumberFormat.getCurrencyInstance().format(mortgage));

        /**
         * ====== OUTPUT =========
         * Principal ($1k - $1M): 0
         * Enter a number between 1,000 and 1,000,000.
         * Principal ($1k - $1M): 1
         * Enter a number between 1,000 and 1,000,000.
         * Principal ($1k - $1M): 154654654
         * Enter a number between 1,000 and 1,000,000.
         * Principal ($1k - $1M): 1000
         * Annual Interest Rate: 0
         * Enter a value greater than 0 and less than or equal to 30.
         * Annual Interest Rate: -2
         * Enter a value greater than 0 and less than or equal to 30.
         * Annual Interest Rate: 31
         * Enter a value greater than 0 and less than or equal to 30.
         * Annual Interest Rate: 2
         * Period (Years): -2
         * Enter a value between 1 and 30.
         * Period (Years): 0
         * Enter a value between 1 and 30.
         * Period (Years): 31
         * Enter a value between 1 and 30.
         * Period (Years): 2
         * Mortgage: $42.54
         */
    }

    public static void moshSolution(){
        final int MONTHS_IN_YEAR = 12;
        final int PERCENT = 100;

        Scanner scanner = new Scanner(System.in);
        long principle;
        while(true){
            System.out.print("Principal ($1k - $1M): ");
            principle = scanner.nextLong();
            if(principle >= 1000 && principle <= 1_000_000)
                break;
            System.out.println("Enter a number between 1,000 and 1,000,000.");
        }

        float interest;
        while(true){
            System.out.print("Annual Interest Rate: ");
            interest = scanner.nextFloat();
            if(interest > 0 && interest <= 30)
                break;
            System.out.println("Enter a value greater than 0 and less than or equal to 30.");
        }
        float monthlyInterest = interest / (PERCENT * MONTHS_IN_YEAR);

        byte years;
        while(true){
            System.out.print("Period (Years): ");
            years = scanner.nextByte();
            if(years >= 1 && years <= 30)
                break;
            System.out.println("Enter a value between 1 and 30.");
        }
        short numberOfPayment = (short) (years * (byte) MONTHS_IN_YEAR);

        double mortgageNumerator = principle * monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayment);
        double mortgageDenominator = Math.pow(1 + monthlyInterest, numberOfPayment) - 1;
        double mortgage = mortgageNumerator / mortgageDenominator;

        System.out.println("Mortgage: " + NumberFormat.getCurrencyInstance().format(mortgage));

        /**
         * ====== OUTPUT =========
         * Principal ($1k - $1M): 0
         * Enter a number between 1,000 and 1,000,000.
         * Principal ($1k - $1M): 1
         * Enter a number between 1,000 and 1,000,000.
         * Principal ($1k - $1M): 154654654
         * Enter a number between 1,000 and 1,000,000.
         * Principal ($1k - $1M): 1000
         * Annual Interest Rate: 0
         * Enter a value greater than 0 and less than or equal to 30.
         * Annual Interest Rate: -2
         * Enter a value greater than 0 and less than or equal to 30.
         * Annual Interest Rate: 31
         * Enter a value greater than 0 and less than or equal to 30.
         * Annual Interest Rate: 2
         * Period (Years): -2
         * Enter a value between 1 and 30.
         * Period (Years): 0
         * Enter a value between 1 and 30.
         * Period (Years): 31
         * Enter a value between 1 and 30.
         * Period (Years): 2
         * Mortgage: $42.54
         */

    }
}

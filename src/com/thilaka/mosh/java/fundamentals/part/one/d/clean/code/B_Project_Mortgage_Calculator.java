package com.thilaka.mosh.java.fundamentals.part.one.d.clean.code;

import java.text.NumberFormat;
import java.util.Scanner;

public class B_Project_Mortgage_Calculator {

    public static void main(String[] args) {
        int principle = (int) readNumber("Principal ($1k - $1M)", 1000, 1_000_000);
        float annualInterest = (float) readNumber("Annual Interest Rate", 1, 30);
        byte years = (byte) readNumber("Period (Years)", 1, 30);
        float monthlyInterest = calculateMonthlyInterest(annualInterest);
        short numberOfPayment = calculateNumberOfPayment(years);

        double mortgage = calculateMortgage(principle, monthlyInterest, numberOfPayment);
        printMortgage(mortgage);
        calculateAndPrintPaymentSchedule(principle, monthlyInterest, numberOfPayment);

    }

    private static double readNumber(String prompt, double min, double max) {
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

    private static float calculateMonthlyInterest(float annualInterest) {
        final int MONTHS_IN_YEAR = 12;
        final int PERCENT = 100;
        return annualInterest / (PERCENT * MONTHS_IN_YEAR);
    }

    private static short calculateNumberOfPayment(byte years) {
        final int MONTHS_IN_YEAR = 12;
        return (short) (years * (byte) MONTHS_IN_YEAR);
    }

    private static double calculateMortgage(int principle, float monthlyInterest, short numberOfPayment) {
        double mortgageNumerator = principle * monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayment);
        double mortgageDenominator = Math.pow(1 + monthlyInterest, numberOfPayment) - 1;
        return mortgageNumerator / mortgageDenominator;
    }

    private static void printMortgage(double mortgage) {
        System.out.println("\nMORTGAGE");
        System.out.println("--------");
        System.out.println("Monthly Payments: " + NumberFormat.getCurrencyInstance().format(mortgage));
    }

    private static void calculateAndPrintPaymentSchedule(int principle, float monthlyInterest, short numberOfPayment) {
        System.out.println("\nPAYMENT SCHEDULE");
        System.out.println("----------------");
        double balance;
        for (short numberOfPaymentMade = 1; numberOfPaymentMade <= numberOfPayment; numberOfPaymentMade++) {
            balance = calculateBalance(principle, monthlyInterest, numberOfPayment, numberOfPaymentMade);
            System.out.println(NumberFormat.getCurrencyInstance().format(balance));
        }
    }

    private static double calculateBalance(int principle, float monthlyInterest, short numberOfPayment, short numberofPaymentsMade) {
        double balanceNumerator = principle * (Math.pow(1 + monthlyInterest, numberOfPayment) - Math.pow(1 + monthlyInterest, numberofPaymentsMade));
        double balanceDenominator = Math.pow(1 + monthlyInterest, numberOfPayment) - 1;
        return balanceNumerator / balanceDenominator;
    }

    /**
     * ======= OUTPUT ==========
     * Principal ($1k - $1M): 180000
     * Annual Interest Rate: 4
     * Period (Years): 10
     *
     * MORTGAGE
     * --------
     * Monthly Payments: $1,822.41
     *
     * PAYMENT SCHEDULE
     * ----------------
     * $178,777.59
     * $177,551.10
     * $176,320.52
     * $175,085.85
     * $173,847.05
     * $172,604.13
     * $171,357.07
     * $170,105.84
     * $168,850.45
     * $167,590.87
     * $166,327.10
     * $165,059.11
     * $163,786.89
     * $162,510.43
     * $161,229.72
     * $159,944.74
     * $158,655.48
     * $157,361.92
     * $156,064.04
     * $154,761.85
     * $153,455.31
     * $152,144.41
     * $150,829.15
     * $149,509.50
     * $148,185.45
     * $146,856.99
     * $145,524.10
     * $144,186.77
     * $142,844.98
     * $141,498.71
     * $140,147.96
     * $138,792.71
     * $137,432.94
     * $136,068.64
     * $134,699.79
     * $133,326.37
     * $131,948.38
     * $130,565.80
     * $129,178.61
     * $127,786.79
     * $126,390.33
     * $124,989.22
     * $123,583.44
     * $122,172.97
     * $120,757.80
     * $119,337.91
     * $117,913.30
     * $116,483.93
     * $115,049.79
     * $113,610.88
     * $112,167.17
     * $110,718.65
     * $109,265.30
     * $107,807.10
     * $106,344.05
     * $104,876.12
     * $103,403.29
     * $101,925.56
     * $100,442.90
     * $98,955.29
     * $97,462.73
     * $95,965.19
     * $94,462.67
     * $92,955.13
     * $91,442.57
     * $89,924.96
     * $88,402.30
     * $86,874.56
     * $85,341.73
     * $83,803.79
     * $82,260.73
     * $80,712.52
     * $79,159.14
     * $77,600.60
     * $76,036.85
     * $74,467.90
     * $72,893.71
     * $71,314.28
     * $69,729.58
     * $68,139.60
     * $66,544.32
     * $64,943.72
     * $63,337.79
     * $61,726.50
     * $60,109.84
     * $58,487.80
     * $56,860.34
     * $55,227.47
     * $53,589.14
     * $51,945.36
     * $50,296.10
     * $48,641.34
     * $46,981.07
     * $45,315.26
     * $43,643.90
     * $41,966.97
     * $40,284.44
     * $38,596.31
     * $36,902.55
     * $35,203.15
     * $33,498.08
     * $31,787.33
     * $30,070.88
     * $28,348.70
     * $26,620.78
     * $24,887.11
     * $23,147.65
     * $21,402.40
     * $19,651.33
     * $17,894.42
     * $16,131.66
     * $14,363.02
     * $12,588.48
     * $10,808.03
     * $9,021.64
     * $7,229.30
     * $5,430.99
     * $3,626.68
     * $1,816.36
     * $0.00
     */

}

package com.thilaka.mosh.java.fundamentals.part.one.b.types;

import java.text.NumberFormat;

public class Q_Formatting_Numbers {
    public static void main(String[] args) {
        NumberFormat currency = NumberFormat.getCurrencyInstance();//factory method
        String result = currency.format(1_234_567.891);
        System.out.println(result);//$1,234,567.89

        NumberFormat percent = NumberFormat.getPercentInstance();
        result = percent.format(0.1);
        System.out.println(result);//10%

        result = NumberFormat.getPercentInstance().format(0.1);//short way of writing.
        System.out.println(result);//10%

    }
}

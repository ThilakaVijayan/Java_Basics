package com.thilaka.mosh.java.fundamentals.part.one.b.types;

public class P_Math_Class {
    public static void main(String[] args) {
        int result = Math.round(1.1F);
        System.out.println(result);//1

        long result2 = Math.round(500.678645D);
        System.out.println(result2);//501

        double result3 = Math.ceil(1.1F);
        System.out.println(result3);//2.0

        result3 = Math.floor(1.1F);
        System.out.println(result3);//1.0

        result = Math.max(1,2);
        System.out.println(result);//2

        result3 = Math.random();
        System.out.println(result3);//0.16499564872902261 different number every time

        result3 = Math.random()*100;
        System.out.println(result3);//16.499564872902261 gets a number between 0 to 100.

        result2 = Math.round(Math.random()*100);
        System.out.println(result2);//16

        result = (int) (Math.random()*100);
        System.out.println(result);//16






    }
}

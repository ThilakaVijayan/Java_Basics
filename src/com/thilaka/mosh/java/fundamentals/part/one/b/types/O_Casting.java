package com.thilaka.mosh.java.fundamentals.part.one.b.types;

public class O_Casting {
    public static void main(String[] args) {
        short x = 1;
        int y = x + 2;//Implicit casting, because short is smaller and int.
        System.out.println(y);//3
        //byte > short > int > long > float > double
         double x1 = 1.1;
         //int y1 = x1 + 2;//compilation error
        double y1 = x1 + 2;
        System.out.println(y1);//3.1

        double x2 = 1.9;
        int y2 = (int) x2 + 2;//Explicit casting
        System.out.println(y2);//3

        String x3 = "1";
        //int y3 = (int) x3 + 2;//Compilation error
        int y3 = Integer.parseInt(x3) + 2;
        System.out.println(y3);//3

        String x4 = "1.1";
        //int y4 = Integer.parseInt(x4) + 2;//Run time exception - Exception in thread "main" java.lang.NumberFormatException: For input string: "1.1"
        double y4 = Double.parseDouble(x4) + 2;
        System.out.println(y4);//3.1

    }
}

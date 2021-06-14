package com.thilaka.mosh.java.fundamentals.part.one.b.types;

public class M_Arithmetic_Expressions {
    public static void main(String[] args) {
        int result = 10 + 3;
        System.out.println(result);//13

        result = 10 - 3;
        System.out.println(result);//7

        result = 10 * 3;
        System.out.println(result);//30

        result = 10 / 3;
        System.out.println(result);//3 - whole number.

        double divideResult = (double)10 / (double)3;
        System.out.println(divideResult);//3.3333333333333335

        divideResult = 10D / 3D;
        System.out.println(divideResult);//3.3333333333333335

        int x = 1;
        x++;
        System.out.println(x);//2

        x = 1;
        ++x;
        System.out.println(x);//2

        x = 1;
        int y = x++;
        System.out.println(x);//2
        System.out.println(y);//1

        x = 1;
        y = ++x;
        System.out.println(x);//2
        System.out.println(y);//2

        x = 1;
        x = x +2;
        System.out.println(x);//3

        x = 1;
        x += 2; //augmented or compound assignment operator
        System.out.println(x);//3

        x = 1;
        x -= 2;
        System.out.println(x);//-1

        x = 1;
        x *= 2; //augmented or compound assignment operator
        System.out.println(x);//2

        x = 10;
        x /= 2; //augmented or compound assignment operator
        System.out.println(x);//5





    }
}

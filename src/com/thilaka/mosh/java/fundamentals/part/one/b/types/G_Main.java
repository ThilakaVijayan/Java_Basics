package com.thilaka.mosh.java.fundamentals.part.one.b.types;

import java.awt.*;

/**
 * Difference between Primitive and Reference Type
 */
public class G_Main {
    public static void main(String[] args) {
        byte x = 1;
        byte y = x;
        x = 2;
        System.out.println(y);//y value will not change to 2.

        Point point1 = new Point(1,1);
        Point point2 = point1;// point2 now stores the same address value that is stored by point1 variable.
        point1.x = 2;
        System.out.println(point2);//outputs - java.awt.Point[x=2,y=1]

    }
}

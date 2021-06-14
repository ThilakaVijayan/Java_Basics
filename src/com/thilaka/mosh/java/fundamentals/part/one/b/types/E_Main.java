package com.thilaka.mosh.java.fundamentals.part.one.b.types;

/**
 * Primitive variables
 */
public class E_Main {
    public static void main(String[] args) {
        byte age = 30;
        int viewCount = 123_456_789;
        //int viewCount = 3_123_456_789;//Compilation error, because it is more than 2B.
        //long viewCount = 3_123_456_789;//Still a compilation error, because it is still declared as int.
        long viewCountL = 3_123_456_789L;//can usse small 'l' as well, but it is hard to read it, looks like 1.
        //float price = 10.99;//compilation error, because java sees this as double declaration.
        float price = 10.99F;
        char letter = 'A';
        boolean isEligible = false;
    }
}

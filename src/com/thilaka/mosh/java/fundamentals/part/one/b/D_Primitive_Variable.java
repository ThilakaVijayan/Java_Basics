package com.thilaka.mosh.java.fundamentals.part.one.b;

/**
 * Primitive variables list
 */
public class D_Primitive_Variable {
    public static void main(String[] args) {
        byte minByte = Byte.MIN_VALUE;
        byte maxByte = Byte.MAX_VALUE;
        System.out.println("Byte Min:" + minByte + ": Max:" + maxByte);

        short minShort = Short.MIN_VALUE;
        short maxShort = Short.MAX_VALUE;
        System.out.println("Short Min:" + minShort + ": Max:" + maxShort);

        int minInt = Integer.MIN_VALUE;
        int maxInt = Integer.MAX_VALUE;
        System.out.println("Int Min:" + minInt + ": Max:" + maxInt);

        long minLong = Long.MIN_VALUE;
        long maxLong = Long.MAX_VALUE;
        System.out.printf("Long Min:%d: Max:%d%n", minLong, maxLong);

        float minFloat = Float.MIN_VALUE;
        float maxFloat = Float.MAX_VALUE;
        System.out.printf("Float Min:%f: Max:%f%n", minFloat, maxFloat);

        double minDouble = Double.MIN_VALUE;
        double maxDouble = Double.MAX_VALUE;
        System.out.printf("Double Min:%f: Max:%f%n", minDouble, maxDouble);

        boolean minBoolean = Boolean.FALSE;
        boolean maxBoolean = Boolean.TRUE;
        System.out.println("Boolean Min:" + minBoolean + ": Max:" + maxBoolean);

        char minChar = Character.MIN_VALUE;
        char maxChar = Character.MAX_VALUE;
        System.out.println("Char Min:" + Integer.valueOf(minChar) + ": Max:" + Integer.valueOf(maxChar));

        /** ========== OUTPUT ==========
         * Byte Min:-128: Max:127
         * Short Min:-32768: Max:32767
         * Int Min:-2147483648: Max:2147483647
         * Long Min:-9223372036854775808: Max:9223372036854775807
         * Float Min:0.000000: Max:340282346638528860000000000000000000000.000000
         * Double Min:0.000000: Max:179769313486231570000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000.000000
         * Boolean Min:false: Max:true
         * Char Min:0: Max:65535
         */

    }
}

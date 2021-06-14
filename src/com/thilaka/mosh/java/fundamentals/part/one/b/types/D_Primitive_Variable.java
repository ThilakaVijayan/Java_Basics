package com.thilaka.mosh.java.fundamentals.part.one.b.types;

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

        float piFloatWithHighPrecision = 3.1415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679F;
        System.out.println(piFloatWithHighPrecision);//3.1415927

        piFloatWithHighPrecision = 0.31415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679F;
        System.out.println(piFloatWithHighPrecision);//0.31415927

        piFloatWithHighPrecision = 0.031415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679F;
        System.out.println(piFloatWithHighPrecision);//0.03141593

        piFloatWithHighPrecision = 31.415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679F;
        System.out.println(piFloatWithHighPrecision);//31.415926
        piFloatWithHighPrecision = 314.15926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679F;
        System.out.println(piFloatWithHighPrecision);//314.15927


        double piDoubleWithHighPrecision = 3.1415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679D;
        System.out.println(piDoubleWithHighPrecision);//3.141592653589793

        piDoubleWithHighPrecision = 0.31415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679D;
        System.out.println(piDoubleWithHighPrecision);//0.3141592653589793

        piDoubleWithHighPrecision = 0.031415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679D;
        System.out.println(piDoubleWithHighPrecision);//0.031415926535897934

        piDoubleWithHighPrecision = 0.0031415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679D;
        System.out.println(piDoubleWithHighPrecision);//0.0031415926535897933

        piDoubleWithHighPrecision = 31.415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679D;
        System.out.println(piDoubleWithHighPrecision);//31.41592653589793

        piDoubleWithHighPrecision = 314.15926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679D;
        System.out.println(piDoubleWithHighPrecision);//314.1592653589793
    }
}

package com.thilaka.mosh.java.fundamentals.part.one.b;

/**
 * String
 */
public class H_String {
    public static void main(String[] args) {
        //String message = new String("Hello World");//new String is redundant
        //String message = "Hello World"; //shorter way to initialize a string.
        // because string is used often, there is a shortcut to initialize it like this. But String is not a primitive type.
        String message = "Hello World" + "!!"; //can concatinate it like this.
        System.out.println(message);

        System.out.println(message.endsWith("!!"));
        System.out.println(message.startsWith("!!"));
        System.out.println(message.length());
        System.out.println(message.indexOf("H"));
        System.out.println(message.indexOf("e"));
        System.out.println(message.indexOf("sky"));
        System.out.println(message.replace("!","*"));
        System.out.println(message);//original string is not changed. In java String is immutable, i.e it cannot be modified.
        System.out.println(message.toLowerCase());
        System.out.println(message.toUpperCase());
        System.out.println(message.trim());

        /** ========== OUTPUT =============
         * Hello World!!
         * true
         * false
         * 13
         * 0
         * 1
         * -1
         * Hello World**
         * Hello World!!
         * hello world!!
         * HELLO WORLD!!
         * Hello World!!
         */

    }
}

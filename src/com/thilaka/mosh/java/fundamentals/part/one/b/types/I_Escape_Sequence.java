package com.thilaka.mosh.java.fundamentals.part.one.b.types;

/**
 * Escape Sequence
 */
public class I_Escape_Sequence {
    public static void main(String[] args) {
        //String message = "Hello "Mosh";//Compilation error
        String message = "Hello \"Mosh\"";
        System.out.println(message);

        String path = "C:\\Windows\\..";
        System.out.println(path);

        String newLines = "abc\nefg";
        System.out.println(newLines);

        String tab = "abc\tefg";
        System.out.println(tab);

        /** ============ OUTPUT ============
         * Hello "Mosh"
         * C:\Windows\..
         * abc
         * efg
         * abc	efg
         */
    }
}

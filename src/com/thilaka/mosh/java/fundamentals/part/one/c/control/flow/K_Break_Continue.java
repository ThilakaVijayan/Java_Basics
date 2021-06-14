package com.thilaka.mosh.java.fundamentals.part.one.c.control.flow;

import java.util.Scanner;

public class K_Break_Continue {
    public static void main(String[] args) {
        withoutBreakStatement();
        withBreakStatement();
        withContinueStatement();
        optimized();
    }

    public static void withoutBreakStatement(){
        String input = "";
        Scanner scanner = new Scanner(System.in);
        while(!"quit".equals(input)){
            System.out.print("Input: ");
            input = scanner.next().toLowerCase();
            if(!input.equals("quit"))
                System.out.println(input);
        }

        /** ====== OUTPUT ======
         * Input: 1
         * 1
         * Input: 2
         * 2
         * Input: quit
         */
    }

    public static void withBreakStatement(){
        String input = "";
        Scanner scanner = new Scanner(System.in);
        while(!"quit".equals(input)){
            System.out.print("Input: ");
            input = scanner.next().toLowerCase();
            if(input.equals("quit"))
                break;
            System.out.println(input);
        }
        /** ====== OUTPUT ======
         * Input: 1
         * 1
         * Input: 2
         * 2
         * Input: quit
         */
    }

    public static void withContinueStatement(){
        String input = "";
        Scanner scanner = new Scanner(System.in);
        while(!"quit".equals(input)){
            System.out.print("Input: ");
            input = scanner.next().toLowerCase();
            if(input.equals("pass"))
                continue;
            if(input.equals("quit"))
                break;
            System.out.println(input);
        }
        /** ====== OUTPUT ======
         * Input: 1
         * 1
         * Input: 2
         * 2
         * Input: pass
         * Input: 3
         * 3
         * Input: quit
         */
    }

    public static void optimized(){
        String input = "";
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.print("Input: ");
            input = scanner.next().toLowerCase();
            if(input.equals("pass"))
                continue;
            if(input.equals("quit"))
                break;
            System.out.println(input);
        }
        /** ====== OUTPUT ======
         * Input: 1
         * 1
         * Input: 2
         * 2
         * Input: pass
         * Input: 3
         * 3
         * Input: quit
         */
    }
}

package com.thilaka.mosh.java.fundamentals.part.one.c.control.flow;

public class F_Switch_Statements {
    public static void main(String[] args) {
        String role = "admin";
        if (role.equals("admin"))
            System.out.println("You're an admin");
        else if (role.equals("moderator"))
            System.out.println("You're a moderator");
        else
            System.out.println("You're a guest");
    }

    public static void withoutSwitchStatement(){
        String role = "admin";
        if (role.equals("admin"))
            System.out.println("You're an admin");
        else if (role.equals("moderator"))
            System.out.println("You're a moderator");
        else
            System.out.println("You're a guest");
    }

    public static void usingSwitchStatement(){
        String role = "admin";
        switch (role){ // switch can be used for numbers as well, except for 'long' type.
            case "admin":
                System.out.println("You're an admin");
                break;
            case "moderator":
                System.out.println("You're a moderator");
                break;
            default:
                System.out.println("You're a guest");
        }
    }
}

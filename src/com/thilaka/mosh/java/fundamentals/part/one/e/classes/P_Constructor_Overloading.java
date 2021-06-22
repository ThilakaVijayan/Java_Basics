package com.thilaka.mosh.java.fundamentals.part.one.e.classes;

public class P_Constructor_Overloading {
    public static void main(String[] args) {
        var employee = new O_Employee(50_000);
        int wage = employee.calculateWage();
        System.out.println(wage);//50000
    }
}

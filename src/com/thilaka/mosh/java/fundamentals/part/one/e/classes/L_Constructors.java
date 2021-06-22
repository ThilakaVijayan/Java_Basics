package com.thilaka.mosh.java.fundamentals.part.one.e.classes;

public class L_Constructors {
    public static void main(String[] args) {
        var employee = new K_Employee(50_000,20);
        int wage = employee.calculateWage(10);
        System.out.println(wage);//50200
    }
}

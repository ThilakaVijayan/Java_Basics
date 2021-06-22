package com.thilaka.mosh.java.fundamentals.part.one.e.classes;

public class N_Method_Overloading {
    public static void main(String[] args) {
        var employee = new M_Employee(50_000,20);
        int wage = employee.calculateWage();
        System.out.println(wage);//50000
    }
}

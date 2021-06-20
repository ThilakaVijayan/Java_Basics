package com.thilaka.mosh.java.fundamentals.part.one.e.classes;

public class F_Encapsulation {
    public static void main(String[] args) {
        var employee = new E_Employee();
        employee.baseSalary = 50_000;
        employee.hourlyRate = 20;
        int wage = employee.calculateWage(10);
        System.out.println(wage);//50200
    }

}

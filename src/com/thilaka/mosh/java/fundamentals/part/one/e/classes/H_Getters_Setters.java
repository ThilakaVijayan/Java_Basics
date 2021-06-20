package com.thilaka.mosh.java.fundamentals.part.one.e.classes;

public class H_Getters_Setters {
    public static void main(String[] args) {
        var employee = new G_Employee2();
        employee.setBaseSalary(50_000);
        employee.setHourlyRate(20);
        int wage = employee.calculateWage(10);
        System.out.println(wage);//50200
    }
}

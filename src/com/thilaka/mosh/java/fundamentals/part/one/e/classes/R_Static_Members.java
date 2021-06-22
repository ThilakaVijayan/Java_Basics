package com.thilaka.mosh.java.fundamentals.part.one.e.classes;

public class R_Static_Members {
    public static void main(String[] args) {
        var employee = new Q_Employee(50_000);
        Q_Employee.printNumberOfEmployee();
        int wage = employee.calculateWage();
        System.out.println(wage);//50000
    }
}

package com.thilaka.mosh.java.fundamentals.part.one.e.classes;

public class E_Employee {
    public int baseSalary;
    public int hourlyRate;

    public int calculateWage(int extraHours){
        return baseSalary + (hourlyRate * extraHours);
    }
}

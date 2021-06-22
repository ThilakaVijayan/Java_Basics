package com.thilaka.mosh.java.fundamentals.part.one.e.classes;

public class K_Employee {
    private int baseSalary;
    private int hourlyRate;

    public K_Employee(int baseSalary, int hourlyRate) {
        setBaseSalary(baseSalary); //using the setter method here, to reuse the validations.
        setHourlyRate(hourlyRate);
    }

    public int calculateWage(int extraHours){
        return baseSalary + (hourlyRate * extraHours);
    }

    private void setBaseSalary(int baseSalary){
        if (baseSalary <= 0)
            throw  new IllegalArgumentException("Salary cannot be zero or less");
        this.baseSalary = baseSalary;
    }

    private int getBaseSalary(){
        return this.baseSalary;
    }

    private void setHourlyRate(int hourlyRate){
        if(hourlyRate <= 0)
            throw new IllegalArgumentException("Hourly rate cannot be zero or less");
        this.hourlyRate = hourlyRate;
    }

    private int getHourlyRate(){
        return this.hourlyRate;
    }
}

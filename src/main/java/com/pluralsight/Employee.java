package com.pluralsight;

import java.util.Scanner;

public class Employee {
    private int employeeId;
    private String name;

    private double hoursWorked, payRate;
    public Employee(int employeeId, String name,double hoursWorked,double payRate ){
        this.employeeId = employeeId;
        this.name = name;
        this.hoursWorked = hoursWorked;
        this.payRate = payRate;

    }
    public double getGrossPay(double payRate, double hoursWorked) {
        return hoursWorked * payRate;
    }




    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getPayRate() {
        return payRate;
    }

    public void setPayRate(String payRate) {
        this.payRate = payRate;
    }

    public String getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(String hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getGrossPay() {
        return grossPay;
    }

    public void setGrossPay(double payRate) {
        this.payRate = grosspay;
    }
}
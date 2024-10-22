package com.pluralsight;

public class Employees {

    private int employeeId;
    private String name;
    private String department;
    private double payRate;
    private float hoursWorked;

    public Employees(int employeeId, String name, String department, double payRate, float hoursWorked) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
    }

    public double getTotalPay(){
        if(hoursWorked > 40){
            float overtimeHours = hoursWorked -40;
            double regularPay = 40 * payRate;
            double overtimePay = overtimeHours * 1.5;
            return regularPay + overtimePay
        }
        else{
            return this.payRate * this.hoursWorked
        }
    }

    public float getRegularHours(){
        return 0;
    }

    public float getOvertimeHours(){
        return 0;
    }
}

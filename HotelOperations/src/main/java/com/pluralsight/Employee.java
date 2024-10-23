package com.pluralsight;

public class Employees {

    private int employeeId;
    private String name;
    private String department;
    private double payRate;
    private float hoursWorked;


    public Employee(int employeeId, String name, String department, double payRate, float hoursWorked) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
    }

    public double getTotalPay(){
        return getRegularPay() + getOvertimePay();
    }

    public double getRegularPay(){
        return getRegularHours() * payRate;
    }

    public double getOvertimePay(){
        return getOvertimeHours() * payRate * 1.5;
    }

    public float getRegularHours(){
        return (hoursWorked > 40) ? 40 : hoursWorked;
    }

    public float getOvertimeHours(){
        return (hoursWorked > 40 ) ? hoursWorked - 40 : 0 ;
    }

    public double getTotalPay() {
        double regularPay = getRegularHours() * payRate;
        double overtimePay = getOvertimeHours() * payRate * 1.5; // Assuming overtime is paid at 1.5x rate
        return overtimePay + regularPay;

}

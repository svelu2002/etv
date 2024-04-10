package com.app.employeehierarchy.model;

public class Employee {
    private int employeeId;
    private String name;
    private double salary;

    public Employee(int employeeId, String name, double salary) {
        this.employeeId = employeeId;
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    // TODO: Implement getters and setters
    public void setName(String name) {
        this.name = name;
    }
    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }



    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


    // TODO: Override toString method to display employee information
    public String toString() {
        return "Name: " + this.getName() + ", Id: " + this.getEmployeeId() + ", Salary: " + this.getSalary();
    }
}

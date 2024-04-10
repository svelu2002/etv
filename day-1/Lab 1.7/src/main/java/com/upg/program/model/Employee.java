package com.upg.program.model;
import com.upg.program.exception.InvalidEmployeeDataException;

public class Employee {
    private String name;
    private int employeeId;
    private double salary;

    public Employee(String name, int employeeId, double salary) throws InvalidEmployeeDataException {
        if (name.isEmpty()) {
            throw new InvalidEmployeeDataException("Name is empty");
        } else {
            this.name = name;
        }
        if (employeeId <= 0) {
            throw new InvalidEmployeeDataException("Employee Id should be positive integer");
        } else {
            this.employeeId = employeeId;
        }
        if (salary <= 0) {
            throw new InvalidEmployeeDataException("Salary should be a positive number");
        } else {
            this.salary = salary;
        }

    }

    public String getName() {
        return name;
    }

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

    void displayDetails() {
        System.out.println("Name: " + this.name);
        System.out.println("EmployeeId: " + this.employeeId);
        System.out.println("Salary: " + this.salary);
    }

}

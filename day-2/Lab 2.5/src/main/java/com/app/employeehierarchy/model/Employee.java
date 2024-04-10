package com.app.employeehierarchy.model;

import java.util.random.RandomGenerator;

public sealed class Employee permits Developer, Manager {
    private int employeeId;
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        RandomGenerator gen = RandomGenerator.of("L128X256MixRandom");
        this.employeeId = gen.nextInt(100);
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

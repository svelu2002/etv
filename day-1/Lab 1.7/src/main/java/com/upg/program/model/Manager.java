package com.upg.program.model;
import com.upg.program.exception.InvalidEmployeeDataException;
public class Manager extends Employee{
    private int teamSize;

    public Manager(String name, int employeeId, double salary, int teamSize) throws InvalidEmployeeDataException {
        super(name, employeeId, salary);
        this.teamSize = teamSize;
    }

    public void displayDetails() {
        super.displayDetails();
        System.out.println("Team Size: " + this.teamSize);
    }
}

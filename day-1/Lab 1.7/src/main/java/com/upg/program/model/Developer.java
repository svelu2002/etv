package com.upg.program.model;
import com.upg.program.exception.InvalidEmployeeDataException;
public class Developer extends Employee {
    private String programmingLanguage;

    public Developer(String name, int employeeId, double salary, String programmingLanguage) throws InvalidEmployeeDataException {
        super(name, employeeId, salary);
        this.programmingLanguage = programmingLanguage;
    }

    public void displayDetails() {
        super.displayDetails();
        System.out.println("Programming Language: " + this.programmingLanguage);
    }
}

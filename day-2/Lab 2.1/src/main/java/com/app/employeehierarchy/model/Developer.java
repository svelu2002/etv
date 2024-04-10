package com.app.employeehierarchy.model;

public class Developer extends Employee {
    private String programmingLanguage;

    public Developer(int employeeId, String name, double salary, String programmingLanguage) {
        super(employeeId, name, salary);
        this.programmingLanguage = programmingLanguage;
    }

    // TODO: Implement getters and setters specific to Developer class

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }

    // TODO: Override toString method to display developer information
    public String toString() {
        return super.toString() + ", " + this.getProgrammingLanguage();
    }
}


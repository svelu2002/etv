package com.app.employeehierarchy.model;

import com.app.employeehierarchy.dto.DeveloperDTO;

public final class Developer extends Employee {
    private String programmingLanguage;

    public Developer(String name, double salary, String programmingLanguage) {
        super(name, salary);
        this.programmingLanguage = programmingLanguage;
    }

    public Developer(DeveloperDTO developerDTO) {
        super(developerDTO.name(), developerDTO.salary());
        this.programmingLanguage = developerDTO.programmingLanguage();
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


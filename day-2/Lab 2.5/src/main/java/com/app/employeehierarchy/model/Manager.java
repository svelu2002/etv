package com.app.employeehierarchy.model;

import com.app.employeehierarchy.dto.ManagerDTO;

public final class Manager extends Employee {
    private int teamSize;

    public Manager(String name, double salary, int teamSize) {
        super(name, salary);
        this.teamSize = teamSize;
    }

    public Manager(ManagerDTO managerDTO) {
        super(managerDTO.name(), managerDTO.salary());
        this.teamSize = managerDTO.teamSize();
    }

    // TODO: Implement getters and setters specific to Manager class

    public int getTeamSize() {
        return teamSize;
    }

    public void setTeamSize(int teamSize) {
        this.teamSize = teamSize;
    }

    // TODO: Override toString method to display manager information
    public String toString() {
        return super.toString() + ", TeamSize: " + this.getTeamSize();
    }
}


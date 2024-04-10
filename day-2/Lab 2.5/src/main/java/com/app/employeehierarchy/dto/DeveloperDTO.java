package com.app.employeehierarchy.dto;

public record DeveloperDTO(String employeeId, String name, double salary, String programmingLanguage) implements EmployeeDTO {}

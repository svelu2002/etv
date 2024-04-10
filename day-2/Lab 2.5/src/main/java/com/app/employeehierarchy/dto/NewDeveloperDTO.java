package com.app.employeehierarchy.dto;

public record NewDeveloperDTO(String name, int salary, String programmingLanguage) implements EmployeeDTO {
}

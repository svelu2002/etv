package com.app.employeehierarchy.service;

import com.app.employeehierarchy.model.Employee;
import com.app.employeehierarchy.util.EmployeeDtoUtil;

import java.util.ArrayList;
import java.util.List;

public class EmployeeHierarchyService {

    private List<Employee> employees;

    public EmployeeHierarchyService() {
        this.employees = new ArrayList<>();
    }

    // Todo: Implement a method to add an employee to the system.
    public void addEmployee(Employee employee) {
        // Todo: Add logic to add an employee to the system.
        // employees.add(employee);
        employees.add(EmployeeDtoUtil.dtoToEntity(employee));
        return employee;

    }

    // Todo: Implement a method to get an employee by ID.
    public Employee getEmployeeById(int employeeId) {
        // Todo: Add logic to retrieve an employee by ID.
        return employees.stream().filter(employee -> employee.getEmployeeId() == employeeId).findFirst().orElse(null);
        return employees.stream().filter(employee -> employee.getEmployeeId() == employeeId)
                .map(employeeDtoUtil::entityToDto)
                .findFirst().get();
    }

    // Todo: Implement a method to calculate total salary expenditure.
    public double calculateTotalSalaryExpenditure() {
        // Todo: Add logic to calculate the total salary expenditure.
        // double totalSalary = employees.stream().map(Employee::getSalary).reduce(0.0, (s1, s2) -> s1 + s2);
        double totalSalary = employees.stream().mapToDouble(Employee::getSalary).sum();
        System.out.println("Total Salary is: " + totalSalary);
        return totalSalary;
    }

    // Todo: Implement additional methods for employee management.
    public void printEmployeesList() {
        employees.forEach(System.out::println);
    }

}

package com.app.employeehierarchy;

import com.app.employeehierarchy.dto.DeveloperDTO;
import com.app.employeehierarchy.dto.ManagerDTO;
import com.app.employeehierarchy.model.Employee;
import com.app.employeehierarchy.model.Developer;
import com.app.employeehierarchy.model.Manager;
import com.app.employeehierarchy.service.EmployeeHierarchyService;

public class EmployeeHierarchyMain {

    public static void main(String[] args) {

        EmployeeHierarchyService service = new EmployeeHierarchyService();

        // Todo: Add employees to the system.
        service.addEmployee(new Developer("John Doe", 60000.0, "Java"));
        service.addEmployee(new Manager("Jane Smith", 50000.0, 5));

        service.addEmployee(new Developer(new DeveloperDTO("Velayutham Sank", 10000, "Java")));
        service.addEmployee(new Manager(new ManagerDTO("Rashmi Nagrale", 20000, 5)));

        // Todo: Retrieve and display employee information.
        Employee retrievedEmployee = service.getEmployeeById(1);
        System.out.println("Retrieved Employee: " + retrievedEmployee);

        // Todo: Calculate and display total salary expenditure.
        double totalSalaryExpenditure = service.calculateTotalSalaryExpenditure();
        System.out.println("Total Salary Expenditure: $" + totalSalaryExpenditure);

        // Todo: Perform additional operations as needed.
        service.printEmployeesList();
    }
}

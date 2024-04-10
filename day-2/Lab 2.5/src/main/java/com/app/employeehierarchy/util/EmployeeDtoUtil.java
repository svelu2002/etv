package com.app.employeehierarchy.util;

import com.app.employeehierarchy.dto.DeveloperDTO;
import com.app.employeehierarchy.dto.EmployeeDTO;
import com.app.employeehierarchy.dto.NewDeveloperDTO;
import com.app.employeehierarchy.model.Developer;
import com.app.employeehierarchy.model.Employee;

public class EmployeeDtoUtil {

    public static EmployeeDTO entityToDto(Employee employee) {
        if (employee instanceof Developer d) {
            return new NewDeveloperDTO(d.getName(), d.getSalary(), d.getProgrammingLanguage());
        }
    }

    public static Employee dtoToEntity(EmployeeDTO employeeDto) {
        if (employeeDto instanceof  DeveloperDTO d)
            return new Developer(d.employeeId(), d.name(), d.salary(), d.programmingLanguage());

    }
}

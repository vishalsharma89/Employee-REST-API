package net.javaguides.ems_backend.mapper;

import net.javaguides.ems_backend.dto.EmployeeDto;
import net.javaguides.ems_backend.entity.Employee;

public class EmployeeMapper {
//    employee to employeeDto
    public static EmployeeDto mapToEmployeeDto(Employee employee){
        return new EmployeeDto(
                employee.getId(),
                employee.getFirstName(),
                employee.getLastName(),
                employee.getEmail()
        );
    }

//    employeeDto to employeejparepository
public static Employee mapToEmployee(EmployeeDto employeeDto){
    return new Employee(
            employeeDto.getId(),
            employeeDto.getFirstName(),
            employeeDto.getLastName(),
            employeeDto.getEmail()
    );
}


}

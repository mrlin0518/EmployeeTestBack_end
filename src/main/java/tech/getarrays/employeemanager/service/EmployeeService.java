package tech.getarrays.employeemanager.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tech.getarrays.employeemanager.model.Employee;
import tech.getarrays.employeemanager.repo.EmployeeRepo;

import java.util.List;

@Service
public interface EmployeeService {
    public Employee addEmployee(Employee employee);

    public List<Employee> findAllEmployees();

    public Employee updateEmployee(Employee employee) ;

    public Employee findEmployeeById(Long id);

    public void deleteEmployee(Long id);
}

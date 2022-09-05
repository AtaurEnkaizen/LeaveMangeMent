package com.example.demo.Service;

import com.example.demo.Model.DepartmentModel;
import com.example.demo.Model.EmployeeModel;

import java.util.List;
import java.util.Optional;

public interface IEmployeeService {
    List<EmployeeModel> getAllEmployees();
    void addEmployees(EmployeeModel employeeModel);

}

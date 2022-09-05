package com.example.demo.Service;

import com.example.demo.Model.DepartmentModel;
import com.example.demo.Model.RoleModel;

import java.util.List;

public interface IDepartmentService {
    List<DepartmentModel> getAllDepartments();
    void addDepartments(DepartmentModel departmentModel);
    DepartmentModel findDepartmentByTitle(String title);
}

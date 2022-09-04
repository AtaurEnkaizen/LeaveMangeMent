package com.example.demo.Service;

import com.example.demo.Model.DepartmentModel;
import com.example.demo.Repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DepartmentService implements IDepartmentService{
    @Autowired
    private DepartmentRepository departmentRepository;
    @Override
    public List<DepartmentModel> getAllDepartments() {
        return departmentRepository.findAll();
    }

    @Override
    public void addDepartments(DepartmentModel departmentModel) {
        departmentRepository.save(departmentModel);
    }
}

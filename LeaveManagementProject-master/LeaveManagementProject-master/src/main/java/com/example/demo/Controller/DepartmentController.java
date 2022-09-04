package com.example.demo.Controller;

import com.example.demo.Model.DepartmentModel;
import com.example.demo.Model.RoleModel;
import com.example.demo.Service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;

    @GetMapping("/departments/all")
    public String getAllDepartments(Model model){
        List<DepartmentModel> allDepartments =  departmentService.getAllDepartments();
        model.addAttribute("departments", allDepartments);
        return "DepartmentIndex";
    }
    @GetMapping("/departments/add")
    public String NewDepartmentForm(Model model){
        model.addAttribute("newDepartment", new DepartmentModel());
        return "AddNewDepartment";
    }
    @PostMapping("/departments/add")
    public String addRole(@ModelAttribute DepartmentModel departmentModel, Model model){
        departmentService.addDepartments(departmentModel);
        return getAllDepartments(model);
    }
}

package com.example.demo.Controller;

import com.example.demo.Model.*;
import com.example.demo.Service.DepartmentService;
import com.example.demo.Service.DesignationService;
import com.example.demo.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;
    @Autowired
    private DepartmentService departmentService;
    @Autowired
    private DesignationService designationService;

    @GetMapping("/employees/all")
    public String getAllEmployees(Model model){
        List<EmployeeModel> allEmployees =  employeeService.getAllEmployees();
        model.addAttribute("employees", allEmployees);
        return "EmployeeIndex";
    }
    @GetMapping("/employees/add")
    public String NewEmployeeForm(Model model){
        model.addAttribute("newEmployee", new EmployeeModel());
        return "AddNewEmployee";
    }
    @PostMapping("/employees/add")
    public String addEmployee(@ModelAttribute EmployeeModel employeeModel, Model model){
        String departmentTitle = employeeModel.getDepartmentModel().getTitle();
        String designationTitle = employeeModel.getDesignationModel().getTitle();
        employeeModel.setDepartmentModel(departmentService.findDepartmentByTitle(departmentTitle));
        employeeModel.setDesignationModel(designationService.findDesignationByTitle(designationTitle));
        employeeService.addEmployees(employeeModel);
        return getAllEmployees(model);
    }
    @GetMapping("/addEmergency/{id}")
    public String NewEmergencyContactForm(@PathVariable("id") int id, Model model){
        return "redirect:/emergency/add/{id}";
    }
}

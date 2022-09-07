package com.example.demo.Controller;

import com.example.demo.FrontendDTO.EmployeeDTO;
import com.example.demo.Model.*;
import com.example.demo.Service.DepartmentService;
import com.example.demo.Service.DesignationService;
import com.example.demo.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin(origins= {"*"})
@RestController
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;
    @Autowired
    private DepartmentService departmentService;
    @Autowired
    private DesignationService designationService;

    @GetMapping("/employees/all")
    public List<EmployeeDTO> getAllEmployees(Model model){
        List<EmployeeModel> allEmployees =  employeeService.getAllEmployees();
        List<EmployeeDTO> allEmployeesDTO = new ArrayList<>();
        for(int i = 0; i < allEmployees.size(); i++)
        {
            allEmployeesDTO.add(new EmployeeDTO(allEmployees.get(i).getId(),
                    allEmployees.get(i).getName(),allEmployees.get(i).getAddress(),
                    allEmployees.get(i).getContact_no(), allEmployees.get(i).getDepartmentModel().getTitle(),
                    allEmployees.get(i).getDesignationModel().getTitle()));
        }
        model.addAttribute("employees", allEmployees);
        return allEmployeesDTO;
    }
    @GetMapping("/employees/add")
    public String NewEmployeeForm(Model model){
        model.addAttribute("newEmployee", new EmployeeModel());
        return "AddNewEmployee";
    }
    /*@PostMapping("/employees/add")
    public String addEmployee(@ModelAttribute EmployeeModel employeeModel, Model model){
        String departmentTitle = employeeModel.getDepartmentModel().getTitle();
        String designationTitle = employeeModel.getDesignationModel().getTitle();
        employeeModel.setDepartmentModel(departmentService.findDepartmentByTitle(departmentTitle));
        employeeModel.setDesignationModel(designationService.findDesignationByTitle(designationTitle));
        employeeService.addEmployees(employeeModel);
        return getAllEmployees(model);
    }*/
    @GetMapping("/addEmergency/{id}")
    public String NewEmergencyContactForm(@PathVariable("id") int id, Model model){
        return "redirect:/emergency/add/{id}";
    }
    @GetMapping("/viewEmergency/{id}")
    public String ViewEmergencyContact(@PathVariable("id") int id, Model model){
        return "redirect:/emergency/all/{id}";
    }
}

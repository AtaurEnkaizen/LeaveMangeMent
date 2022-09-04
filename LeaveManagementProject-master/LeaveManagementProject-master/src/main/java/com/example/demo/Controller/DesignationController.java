package com.example.demo.Controller;

import com.example.demo.Model.DepartmentModel;
import com.example.demo.Model.DesignationModel;
import com.example.demo.Service.DepartmentService;
import com.example.demo.Service.DesignationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class DesignationController {
    @Autowired
    private DesignationService designationService;

    @GetMapping("/designations/all")
    public String getAllDesignations(Model model){
        List<DesignationModel> allDesignation =  designationService.getAllDesignations();
        model.addAttribute("designations", allDesignation);
        return "DesignationIndex";
    }
    @GetMapping("/designations/add")
    public String NewDesignationForm(Model model){
        model.addAttribute("newDesignation", new DesignationModel());
        return "AddNewDesignation";
    }
    @PostMapping("/designations/add")
    public String addRole(@ModelAttribute DesignationModel designationModel, Model model){
        designationService.addDesignations(designationModel);
        return getAllDesignations(model);
    }
}

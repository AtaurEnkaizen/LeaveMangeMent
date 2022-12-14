package com.example.demo.Controller;

import com.example.demo.Model.DesignationModel;
import com.example.demo.Model.EmergencyContactModel;
import com.example.demo.Model.EmployeeModel;
import com.example.demo.Repository.EmergencyContactRepository;
import com.example.demo.Service.EmergencyContactService;
import com.example.demo.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/emergency")
public class EmergencyContactController {
    @Autowired
    private EmergencyContactService emergencyContactService;
    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/all/{id}")
    public String Index(@PathVariable("id") int id, Model model)
    {
        List<EmergencyContactModel> emergencyContactModels = emergencyContactService.getAllEmergencyContacts(id);
        model.addAttribute("emergencyContacts", emergencyContactModels);
        return "EmergencyContactIndex";
    }
    @GetMapping("/add/{id}")
    public String NewEmergencyContactForm(@PathVariable("id") int id, Model model){
        model.addAttribute("emergencyContact", new EmergencyContactModel());
        EmployeeModel employeeModel = new EmployeeModel(id);
        model.addAttribute("employee", employeeModel);
        return "AddNewEmergencyContact";
    }

    @PostMapping("/add/{id}")
    public String addEmergencyContact(@PathVariable("id") int id, @ModelAttribute EmergencyContactModel emergencyContactModel, Model model)
    {
        emergencyContactModel.setEmployeeModel(new EmployeeModel(id));
        emergencyContactService.addEmergencyContact(emergencyContactModel);
        return "redirect:/employees/all";
    }
}

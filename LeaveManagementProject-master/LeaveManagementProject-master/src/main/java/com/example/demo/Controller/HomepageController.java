package com.example.demo.Controller;

import com.example.demo.Model.EmployeeModel;
import com.example.demo.Model.LeaveTypeModel;
import com.example.demo.Service.LeaveTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class HomepageController {

    @Autowired
    private LeaveTypeService leaveTypeService;
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(Model model)
    {
        model.addAttribute("leaveTypes", leaveTypeService.getAllLeaveTypes());
        return "HomePage";
    }
    @GetMapping("/add/NewType")
    public String addNewLeaveType(Model model)
    {
        model.addAttribute("newLeaveType", new LeaveTypeModel());
        return "AddNewLeaveType";
    }
    @PostMapping("/leaveTypes/add")
    public String addNewLeaveType(@ModelAttribute LeaveTypeModel leaveTypeModel, Model model)
    {
        leaveTypeService.addLeaveType(leaveTypeModel);
        return index(model);
    }
}

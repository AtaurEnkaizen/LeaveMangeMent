package com.example.demo.Controller;

import com.example.demo.Model.RoleModel;
import com.example.demo.Service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class RoleController {
    @Autowired
    private RoleService roleService;

    @GetMapping("/roles/all")
    public String getAllRoles(Model model){
        List<RoleModel> allRoles =  roleService.getAllRoles();
        model.addAttribute("roles", allRoles);
        return "RoleIndex";
    }
    @GetMapping("/roles/add")
    public String NewRoleForm(Model model){
        model.addAttribute("newRole", new RoleModel());
        return "AddNewRole";
    }
    @PostMapping("/roles/add")
    public String addRole(@ModelAttribute RoleModel roleModel, Model model){
        roleService.addRoles(roleModel);
        return getAllRoles(model);
    }
}

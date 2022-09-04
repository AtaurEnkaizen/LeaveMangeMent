package com.example.demo.Controller;

import com.example.demo.Model.RoleModel;
import com.example.demo.Model.UserModel;
import com.example.demo.Service.RoleService;
import com.example.demo.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @Autowired
    private RoleService roleService;

    @GetMapping("/users/all")
    public String getAllUsers(Model model){
        List<UserModel> allUsers =  userService.getAllUsers();
        model.addAttribute("users", allUsers);
        return "UserIndex";
    }
    @GetMapping("/users/add")
    public String NewUserForm(Model model){
        model.addAttribute("newUser", new UserModel());
        return "AddNewUser";
    }
    @PostMapping("/users/add")
    public String addUser(@ModelAttribute UserModel userModel, Model model){
        String role = userModel.getRoleModel().getTitle();
        int roleId = roleService.findRoleId(role);
        RoleModel roleModel = new RoleModel(roleId, role);
        userModel.setRoleModel(roleModel);
        userService.addUsers(userModel);
        return getAllUsers(model);
    }
}

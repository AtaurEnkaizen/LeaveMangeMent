package com.example.demo.Service;

import com.example.demo.Model.RoleModel;

import java.util.List;

public interface IRoleService {
    List<RoleModel> getAllRoles();
    void addRoles(RoleModel roleModel);
    int findRoleId(String role);
}

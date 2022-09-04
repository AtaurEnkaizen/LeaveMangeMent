package com.example.demo.Service;

import com.example.demo.Model.RoleModel;
import com.example.demo.Repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RoleService implements IRoleService{
    @Autowired
    private RoleRepository roleRepository;

    @Override
    public List<RoleModel> getAllRoles() {
        return roleRepository.findAll();
    }

    @Override
    public void addRoles(RoleModel roleModel) {
        roleRepository.save(roleModel);
    }

    @Override
    public int findRoleId(String role) {
       RoleModel roleModel =  roleRepository.findByTitle(role);
       return roleModel.getId();
    }
}

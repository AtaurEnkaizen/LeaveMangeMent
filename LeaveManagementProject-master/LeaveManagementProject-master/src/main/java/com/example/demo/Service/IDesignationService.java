package com.example.demo.Service;

import com.example.demo.Model.DesignationModel;
import com.example.demo.Model.RoleModel;

import java.util.List;

public interface IDesignationService {
    List<DesignationModel> getAllDesignations();
    void addDesignations(DesignationModel designationModel);
}

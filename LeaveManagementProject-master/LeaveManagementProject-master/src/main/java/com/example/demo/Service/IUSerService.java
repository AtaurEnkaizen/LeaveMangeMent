package com.example.demo.Service;

import com.example.demo.Model.RoleModel;
import com.example.demo.Model.UserModel;

import java.util.List;

public interface IUSerService {
    List<UserModel> getAllUsers();
    void addUsers(UserModel userModel);
}

package com.example.demo.Service;

import com.example.demo.Model.UserModel;
import com.example.demo.Repository.RoleRepository;
import com.example.demo.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserService implements IUSerService{

    @Autowired
    private UserRepository userRepository;
    @Override
    public List<UserModel> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public void addUsers(UserModel userModel) {
        userRepository.save(userModel);
    }

}

package com.example.demo.Service;

import com.example.demo.Model.LeaveTypeModel;
import com.example.demo.Repository.LeaveTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class LeaveTypeService implements ILeaveTypeService {
    @Autowired
    private LeaveTypeRepository leaveTypeRepository;
    @Override
    public List<LeaveTypeModel> getAllLeaveTypes() {
        return leaveTypeRepository.findAll();
    }

    @Override
    public void addLeaveType(LeaveTypeModel leaveTypeModel) {
        leaveTypeRepository.save(leaveTypeModel);
    }
}

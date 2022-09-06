package com.example.demo.Service;

import com.example.demo.Model.LeaveTypeModel;

import java.util.List;

public interface ILeaveTypeService {
    List<LeaveTypeModel> getAllLeaveTypes();
    void addLeaveType(LeaveTypeModel leaveTypeModel);
}

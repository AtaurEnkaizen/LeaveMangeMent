package com.example.demo.Service;

import com.example.demo.Model.EmergencyContactModel;

public interface IEmergencyContactService {
    void addEmergencyContact(EmergencyContactModel emergencyContactModel);
    EmergencyContactModel findByEmployeeId(int employeeId);
}

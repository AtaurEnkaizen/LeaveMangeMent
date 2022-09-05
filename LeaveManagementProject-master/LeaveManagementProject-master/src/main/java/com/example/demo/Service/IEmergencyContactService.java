package com.example.demo.Service;

import com.example.demo.Model.EmergencyContactModel;

import java.util.List;

public interface IEmergencyContactService {
    void addEmergencyContact(EmergencyContactModel emergencyContactModel);
    EmergencyContactModel findByEmployeeId(int employeeId);

    List<EmergencyContactModel> getAllEmergencyContacts(int employeeId);
}

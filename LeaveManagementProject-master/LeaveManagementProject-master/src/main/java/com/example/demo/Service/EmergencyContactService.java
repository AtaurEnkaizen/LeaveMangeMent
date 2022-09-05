package com.example.demo.Service;

import com.example.demo.Model.EmergencyContactModel;
import com.example.demo.Repository.EmergencyContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmergencyContactService implements IEmergencyContactService{
    @Autowired
    private EmergencyContactRepository emergencyContactRepository;
    @Override
    public void addEmergencyContact(EmergencyContactModel emergencyContactModel) {
        emergencyContactRepository.save(emergencyContactModel);
    }

    @Override
    public EmergencyContactModel findByEmployeeId(int employeeId) {
        return null;
    }
}

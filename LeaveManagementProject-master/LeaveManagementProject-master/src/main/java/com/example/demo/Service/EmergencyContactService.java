package com.example.demo.Service;

import com.example.demo.Model.EmergencyContactModel;
import com.example.demo.Model.EmployeeModel;
import com.example.demo.Repository.EmergencyContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

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

    @Override
    public List<EmergencyContactModel> getAllEmergencyContacts(int employeeId) {
        EmployeeModel employeeModel = new EmployeeModel(employeeId);
        return emergencyContactRepository.findByEmployee(employeeModel.getId());
    }
}

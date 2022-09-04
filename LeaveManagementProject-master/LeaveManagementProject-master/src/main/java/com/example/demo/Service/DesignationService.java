package com.example.demo.Service;

import com.example.demo.Model.DesignationModel;
import com.example.demo.Repository.DesignationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DesignationService implements IDesignationService{
    @Autowired
    private DesignationRepository designationRepository;

    @Override
    public List<DesignationModel> getAllDesignations() {
        return designationRepository.findAll();
    }

    @Override
    public void addDesignations(DesignationModel designationModel) {
        designationRepository.save(designationModel);
    }
}

package com.example.demo.Repository;

import com.example.demo.Model.DesignationModel;
import com.example.demo.Model.EmployeeModel;
import com.example.demo.Model.RoleModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DesignationRepository extends JpaRepository<DesignationModel, Long> {
    DesignationModel findByTitle(String title);
}

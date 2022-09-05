package com.example.demo.Repository;

import com.example.demo.Model.EmergencyContactModel;
import com.example.demo.Model.EmployeeModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmergencyContactRepository extends JpaRepository<EmergencyContactModel, Long> {
    @Query(value = "SELECT * FROM leavemanagementsystem.emergency_contacts\n" +
            "where leavemanagementsystem.emergency_contacts.employee_model_id = :employeeId", nativeQuery = true)
    List<EmergencyContactModel> findByEmployee(@Param("employeeId") int employeeId);
}

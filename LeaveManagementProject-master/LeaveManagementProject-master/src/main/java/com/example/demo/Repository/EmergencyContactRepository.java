package com.example.demo.Repository;

import com.example.demo.Model.EmergencyContactModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmergencyContactRepository extends JpaRepository<EmergencyContactModel, Long> {
}

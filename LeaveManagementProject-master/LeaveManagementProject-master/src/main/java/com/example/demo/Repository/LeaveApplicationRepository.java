package com.example.demo.Repository;

import com.example.demo.Model.LeaveApplicationModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LeaveApplicationRepository extends JpaRepository<LeaveApplicationModel, Long> {
}

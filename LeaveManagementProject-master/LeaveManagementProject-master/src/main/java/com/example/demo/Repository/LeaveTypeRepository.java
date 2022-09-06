package com.example.demo.Repository;

import com.example.demo.Model.LeaveTypeModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LeaveTypeRepository extends JpaRepository<LeaveTypeModel, Long> {
}

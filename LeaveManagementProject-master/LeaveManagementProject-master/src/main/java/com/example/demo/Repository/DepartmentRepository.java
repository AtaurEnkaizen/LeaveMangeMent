package com.example.demo.Repository;

import com.example.demo.Model.DepartmentModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<DepartmentModel, Long> {
}
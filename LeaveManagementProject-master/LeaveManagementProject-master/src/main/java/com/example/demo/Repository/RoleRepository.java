package com.example.demo.Repository;

import com.example.demo.Model.RoleModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<RoleModel, Long> {
    RoleModel findByTitle(String title);
}

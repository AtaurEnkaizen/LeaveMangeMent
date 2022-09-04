package com.example.demo.Model;

import javax.persistence.*;

@Entity
@Table(name = "employees")
public class EmployeeModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "address")
    private String address;
    @Column(name = "is_active")
    private boolean is_active;

    //Relations
    @ManyToOne
    @JoinColumn(name = "department_model_id")
    private DepartmentModel departmentModel;

    @ManyToOne
    @JoinColumn(name = "designation_model_id")
    private DesignationModel designationModel;

}

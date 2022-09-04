package com.example.demo.Model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "departments")
public class DepartmentModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "title")
    private String title;
    @OneToMany(mappedBy = "departmentModel", fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    private Set<EmployeeModel> employees;

    //Constructors


    public DepartmentModel() {
    }

    public DepartmentModel(String title) {
        this.title = title;
    }

    //Getter and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Set<EmployeeModel> getEmployees() {
        return employees;
    }

    public void setEmployees(Set<EmployeeModel> employees) {
        this.employees = employees;
    }
}

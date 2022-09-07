package com.example.demo.Model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "designations")
public class DesignationModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "title")
    private String title;

    //Relations
    @OneToMany(mappedBy = "designationModel", fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    private Set<EmployeeModel> employees;
    //Constructors

    public DesignationModel(String title) {
        this.title = title;
    }

    public DesignationModel() {
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

    @JsonManagedReference
    public Set<EmployeeModel> getEmployees() {
        return employees;
    }

    public void setEmployees(Set<EmployeeModel> employees) {
        this.employees = employees;
    }
}

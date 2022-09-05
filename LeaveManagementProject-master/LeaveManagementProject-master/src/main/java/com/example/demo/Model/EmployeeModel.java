package com.example.demo.Model;

import javax.persistence.*;
import java.util.Set;

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
    @Column(name = "contact_no")
    private String contact_no;
    @Column(name = "is_active")
    private boolean is_active;

    //Relations
    @ManyToOne
    @JoinColumn(name = "department_model_id")
    private DepartmentModel departmentModel;

    @ManyToOne
    @JoinColumn(name = "designation_model_id")
    private DesignationModel designationModel;

    @OneToMany(mappedBy = "employeeModel", fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    private Set<EmergencyContactModel> emergencyContactModels;

    //Getters and Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContact_no() {
        return contact_no;
    }

    public void setContact_no(String contact_no) {
        this.contact_no = contact_no;
    }

    public boolean isIs_active() {
        return is_active;
    }

    public void setIs_active(boolean is_active) {
        this.is_active = is_active;
    }

    public DepartmentModel getDepartmentModel() {
        return departmentModel;
    }

    public void setDepartmentModel(DepartmentModel departmentModel) {
        this.departmentModel = departmentModel;
    }

    public DesignationModel getDesignationModel() {
        return designationModel;
    }

    public void setDesignationModel(DesignationModel designationModel) {
        this.designationModel = designationModel;
    }

    public Set<EmergencyContactModel> getEmergencyContactModels() {
        return emergencyContactModels;
    }

    public void setEmergencyContactModels(Set<EmergencyContactModel> emergencyContactModels) {
        this.emergencyContactModels = emergencyContactModels;
    }

    //Constructor


    public EmployeeModel(int id) {
        this.id = id;
    }

    public EmployeeModel() {
    }

    public EmployeeModel(String name, String address, String contact_no, DepartmentModel departmentModel, DesignationModel designationModel) {
        this.name = name;
        this.address = address;
        this.contact_no = contact_no;
        this.departmentModel = departmentModel;
        this.designationModel = designationModel;
    }

    @Override
    public String toString() {
        return "EmployeeModel{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", contact_no='" + contact_no + '\'' +
                ", is_active=" + is_active +
                ", departmentModel=" + departmentModel +
                ", designationModel=" + designationModel +
                ", emergencyContactModels=" + emergencyContactModels +
                '}';
    }
}

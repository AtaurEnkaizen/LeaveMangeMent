package com.example.demo.Model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "leave_type")
public class LeaveTypeModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "title")
    private String title;
    //Relations
    @OneToMany(mappedBy = "leaveTypeModel", fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    private Set<LeaveApplicationModel> leaveApplicationModels;


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
    //Constructor

    public LeaveTypeModel() {
    }

    public Set<LeaveApplicationModel> getLeaveApplicationModels() {
        return leaveApplicationModels;
    }

    public void setLeaveApplicationModels(Set<LeaveApplicationModel> leaveApplicationModels) {
        this.leaveApplicationModels = leaveApplicationModels;
    }

    public LeaveTypeModel(int id, String title, Set<LeaveApplicationModel> leaveApplicationModels) {
        this.id = id;
        this.title = title;
        this.leaveApplicationModels = leaveApplicationModels;
    }
}

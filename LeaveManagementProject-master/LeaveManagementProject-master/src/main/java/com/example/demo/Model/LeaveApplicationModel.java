package com.example.demo.Model;

import javax.persistence.*;

@Entity
@Table(name = "leave_applications")
public class LeaveApplicationModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "from")
    private String from;
    @Column(name = "to")
    private String to;
    @Column(name = "days")
    private int days;
    @Column(name = "details")
    private String details;
    @Column(name = "status")
    private String status;


    //Relations
    @ManyToOne()
    @JoinColumn(name = "leave_type_model_id")
    private LeaveTypeModel leaveTypeModel;

    @ManyToOne
    @JoinColumn(name = "user_model_id")
    private UserModel userModel;


    //Getter And Setters

    public UserModel getUserModel() {
        return userModel;
    }

    public void setUserModel(UserModel userModel) {
        this.userModel = userModel;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LeaveTypeModel getLeaveTypeModel() {
        return leaveTypeModel;
    }

    public void setLeaveTypeModel(LeaveTypeModel leaveTypeModel) {
        this.leaveTypeModel = leaveTypeModel;
    }
    //Constructors
    public LeaveApplicationModel(int id, String from, String to, int days, String details, String status, LeaveTypeModel leaveTypeModel, UserModel userModel) {
        this.id = id;
        this.from = from;
        this.to = to;
        this.days = days;
        this.details = details;
        this.status = status;
        this.leaveTypeModel = leaveTypeModel;
        this.userModel = userModel;
    }
    public LeaveApplicationModel() {
    }
}

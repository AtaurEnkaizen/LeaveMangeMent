package com.example.demo.Model;

import javax.lang.model.element.Name;
import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "users")
public class UserModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "email")
    private String email;
    @Column(name = "password")
    private String password;
    @Column(name = "email_verified_at")
    private String email_verified_at;
    @Column(name = "remember_token")
    private String remember_token;

    @ManyToOne
    @JoinColumn(name = "role_model_id")
    private RoleModel roleModel;

    @OneToMany(mappedBy = "userModel", fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    private Set<LeaveApplicationModel> leaveApplicationModels;


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail_verified_at() {
        return email_verified_at;
    }

    public void setEmail_verified_at(String email_verified_at) {
        this.email_verified_at = email_verified_at;
    }

    public String getRemember_token() {
        return remember_token;
    }

    public void setRemember_token(String remember_token) {
        this.remember_token = remember_token;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public RoleModel getRoleModel() {
        return roleModel;
    }

    public void setRoleModel(RoleModel roleModel) {
        this.roleModel = roleModel;
    }

    public Set<LeaveApplicationModel> getLeaveApplicationModels() {
        return leaveApplicationModels;
    }

    public void setLeaveApplicationModels(Set<LeaveApplicationModel> leaveApplicationModels) {
        this.leaveApplicationModels = leaveApplicationModels;
    }

    public UserModel() {
    }

    public UserModel(int id, String email, String password, String email_verified_at, String remember_token, RoleModel roleModel, Set<LeaveApplicationModel> leaveApplicationModels) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.email_verified_at = email_verified_at;
        this.remember_token = remember_token;
        this.roleModel = roleModel;
        this.leaveApplicationModels = leaveApplicationModels;
    }


    public UserModel(String email, RoleModel role) {
        this.email = email;
        this.roleModel = role;
    }
}

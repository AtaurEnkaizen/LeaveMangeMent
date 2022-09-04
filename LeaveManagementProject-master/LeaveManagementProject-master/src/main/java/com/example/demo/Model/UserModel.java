package com.example.demo.Model;

import javax.lang.model.element.Name;
import javax.persistence.*;

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

    public UserModel() {
    }

    public UserModel(String email, String password, String email_verified_at, String remember_token, RoleModel role) {
        this.email = email;
        this.password = password;
        this.email_verified_at = email_verified_at;
        this.remember_token = remember_token;
        this.roleModel = role;
    }

    public UserModel(String email, RoleModel role) {
        this.email = email;
        this.roleModel = role;
    }
}

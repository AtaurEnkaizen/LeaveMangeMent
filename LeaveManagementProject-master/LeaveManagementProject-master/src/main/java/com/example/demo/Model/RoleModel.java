package com.example.demo.Model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "roles")
public class RoleModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "title")
    private String title;
    @OneToMany(mappedBy = "roleModel", fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    private Set<UserModel> users;

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

    public RoleModel() {
    }

    public RoleModel(int id, String title)
    {
        this.id = id;
        this.title = title;
    }
    public RoleModel(String title, Set<UserModel> users) {
        this.users = users;
        this.title = title;
    }

    @Override
    public String toString() {
        return "RoleModel{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", users=" + users +
                '}';
    }
}

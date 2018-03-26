package com.automaticamusements.app.server;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by wahaba on 08/12/2017.
 */
@Entity
@Table(name = "users")
public class User {
    @Id
    @Column(unique = true)
    int id;
    String name;

    User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    User() {

    }

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
}

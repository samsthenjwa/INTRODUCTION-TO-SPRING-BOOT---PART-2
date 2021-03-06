package com.example.demo.Model;

public class User {
    private long Id;
    private String name;
    private String surname;

    public User(long id, String name, String surname) {
        Id = id;
        this.name = name;
        this.surname = surname;
    }

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}

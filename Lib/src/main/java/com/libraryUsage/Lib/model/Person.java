package com.libraryUsage.Lib.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String name;
    private String surname;
    private String number;
    private String email;
    private String address;
    private String password;

    public Person() {}

    public Person(int id, String name, String surname, String number, String email, String address, String password) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.number = number;
        this.email = email;
        this.address = address;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getNumber() {
        return number;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public String getPassword() {
        return password;
    }

    public void setUserID(int userID) {
        this.id = userID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname ) {
        this.surname = surname;
    }

    public void setNumber(String phoneNum) {
        this.number = phoneNum;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "[id=" + id + " Firstname=" + name + " Lastname=" + surname + " number=" +
                number + " email=" + email + " address=" + address + " password=" + password+ "]";
    }
}

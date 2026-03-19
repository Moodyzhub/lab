/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;

/**
 *
 * @author huyca
 */
public class Account {

    private String username;
    private String password;
    private String name;
    private String phone;
    private String email;
    private String address;
    private Date dob;

    public Account() {
    }

    public Account(String userName, String password, String name, String phone, String email, String address, Date dob) {
        this.username = userName;
        this.password = password;
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.address = address;
        this.dob = dob;
    }

    public String getUserName() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }
    public void setPassword(String password) {
        this.password = password;
    }
}

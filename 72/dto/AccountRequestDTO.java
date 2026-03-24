/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dto;

/**
 * DTO (Data Transfer Object) dùng để chuyển dữ liệu Request từ người dùng xuống Controller
 * @author huyca
 */
public class AccountRequestDTO {

    // Các trường thông tin nhận từ người dùng gốc dưới dạng chuỗi (String)
    private String username;
    private String password;
    private String name;
    private String phone;
    private String email;
    private String address;
    private String dob;

    public AccountRequestDTO(String username, String password, String name, String phone, String email, String address, String dob) {
        this.username = username;
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

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public String getDob() {
        return dob;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dto;

/**
 * DTO (Data Transfer Object) dùng để chứa dữ liệu trả về sau khi phản hồi 
 * @author huyca
 */
public class AccountResponseDTO {

    // Các trường thông tin sẽ trả về cho View
    private String username;
    private String name;

    public AccountResponseDTO(String username, String name) {
        this.username = username;
        this.name = name;
    }

    public String getUserName() {
        return username;
    }

    public String getName() {
        return name;
    }

}

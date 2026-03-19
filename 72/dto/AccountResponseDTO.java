/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dto;

/**
 *
 * @author huyca
 */
public class AccountResponseDTO {

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

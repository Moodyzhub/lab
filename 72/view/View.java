/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

/**
 *
 * @author huyca
 */
public class View {

    private String username;

    public void setUsername(String username) {
        this.username = username;
    }

    public void loginSucess() {
        System.out.println("----------Welcome----------");
        System.out.println("Hello" + username);
    }

    public void loginFail() {
        System.out.println("Login failed!");
    }
}

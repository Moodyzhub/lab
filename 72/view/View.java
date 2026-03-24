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

    // Gán tên người dùng hiện tại
    public void setUsername(String username) {
        this.username = username;
    }

    // Hiển thị thông báo đăng nhập thành công
    public void loginSucess() {
        System.out.println("----------Welcome----------");
        System.out.println("Hello" + username);
    }

    // Hiển thị thông báo đăng nhập thất bại
    public void loginFail() {
        System.out.println("Login failed!");
    }
}

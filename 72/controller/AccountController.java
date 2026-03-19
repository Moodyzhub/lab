/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import dto.AccountRequestDTO;
import service.AccountService;
import view.View;

/**
 *
 * @author huyca
 */
public class AccountController {

    private AccountService service;
    private View view;

    public AccountController() {
        service = new AccountService();
        view = new View();
    }

    public void addAccount(AccountRequestDTO dto) throws Exception {
        service.addAccount(dto);
    }

    public void login(String username, String password) throws Exception {
        service.login(username, password);
        view.setUsername(username);
        view.loginSucess();
    }

    public boolean isUsernameExist(String username) {
        return service.isUsernameExist(username);
    }

    public void changePassword(String username, String oldPassword, String newPassword) throws Exception {
        service.changePassword(username, oldPassword, newPassword);
    }

}

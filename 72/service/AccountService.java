/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import dto.AccountRequestDTO;
import model.Account;
import repository.AccountRepository;
import util.MD5Util;
//import util.MD5Util;

/**
 * 00000000000000000
 *
 * @author huyca
 */
public class AccountService {

    private AccountRepository repository;

    public AccountService() {
        repository = new AccountRepository();
    }

    public void addAccount(AccountRequestDTO dto) throws Exception {
        repository.add(dto);
    }

    public void login(String username, String password) throws Exception {
        verifyAccount(username, password);
    }

    public boolean isUsernameExist(String username) {
        return repository.findByUserName(username) != null;
    }

    public void changePassword(String username, String oldPassword, String newPassword) throws Exception {

        Account account = verifyAccount(username, oldPassword);

        account.setPassword(newPassword);
    }

    private Account verifyAccount(String username, String password) throws Exception {

        Account account = repository.findByUserName(username);

        if (account == null) {
            throw new Exception("Username does not exist!");
        }

        if (!password.equals(account.getPassword())) {
            throw new Exception("Password incorrect!");
        }

        return account;
    }

}

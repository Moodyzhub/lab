/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import dto.AccountRequestDTO;
import model.Account;
import repository.AccountRepository;
import view.View;

/**
 *
 * @author huyca
 */
public class AccountController {

    private AccountRepository repository;
    private View view;

    // Constructor khởi tạo Repository và View
    public AccountController() {
        repository = new AccountRepository();
        view = new View();
    }

    // Phương thức thêm tài khoản mới
    public void addAccount(AccountRequestDTO dto) throws Exception {
        repository.add(dto);
    }

    // Phương thức xử lý đăng nhập
    public void login(String username, String password) throws Exception {
        verifyAccount(username, password);
        view.setUsername(username);
        view.loginSucess();
    }

    // Kiểm tra tài khoản đã tồn tại hay chưa
    public boolean isUsernameExist(String username) {
        return repository.findByUserName(username) != null;
    }

    // Phương thức thay đổi mật khẩu
    public void changePassword(String username, String oldPassword, String newPassword) throws Exception {
        Account account = verifyAccount(username, oldPassword);
        account.setPassword(newPassword);
    }

    // Phương thức xác thực thông tin tài khoản
    private Account verifyAccount(String username, String password) throws Exception {
        Account account = repository.findByUserName(username);

        // Ném lỗi nếu tài khoản không tồn tại
        if (account == null) {
            throw new Exception("Username does not exist!");
        }

        // Ném lỗi nếu sai mật khẩu
        if (!password.equals(account.getPassword())) {
            throw new Exception("Password incorrect!");
        }

        return account;
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;
import model.Account;
import dto.AccountRequestDTO;

/**
 *
 * @author huyca
 */
public class AccountRepository {

    // Cấu trúc dữ liệu lưu trữ tài khoản mô phỏng Database (Key: username, Value: Account)
    private Map<String, Account> accountData = new HashMap<>();

    // Phương thức thêm tài khoản mới vào hệ thống (Database)
    public void add(AccountRequestDTO dto) throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        // Khởi tạo đối tượng Entity từ DTO
        Account account = new Account(dto.getUserName(), dto.getPassword(),
                dto.getName(), dto.getPhone(), dto.getEmail(), dto.getAddress(), 
                sdf.parse(dto.getDob()));
        // Lưu trữ tài khoản vào Map
        accountData.put(dto.getUserName(), account);
    }

    // Tìm kiếm tài khoản dựa trên tên đăng nhập (username)
    public Account findByUserName(String username) {
        return accountData.get(username);
    }
}

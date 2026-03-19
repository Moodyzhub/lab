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

    private Map<String, Account> accountData = new HashMap<>();

    // add new account 
    public void add(AccountRequestDTO dto) throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Account account = new Account(dto.getUserName(), dto.getPassword(),
                dto.getName(), dto.getPhone(), dto.getEmail(), dto.getAddress(), 
                sdf.parse(dto.getDob()));
        accountData.put(dto.getUserName(), account);
    }

    // check username xem ton tai hay chua 
    public Account findByUserName(String username) {
        return accountData.get(username);
    }
}

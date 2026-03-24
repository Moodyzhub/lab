/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import constanst.Message;
import java.text.SimpleDateFormat;

/**
 *
 * @author huyca
 */
public final class Validator {

    private Validator() {
    }

    // Kiểm tra đầu vào rỗng hoặc null
    public static void checkEmpty(String input) throws Exception {
        if (input == null || input.trim().isEmpty()) {
            throw new Exception(Message.INPUT_INVALID);
        }

    }

    // Kiểm tra định dạng số điện thoại (phải là 10 hoặc 11 chữ số)
    public static void isValidPhone(String phone) throws Exception {
        if (!phone.matches("\\d{10,11}")) {
            throw new Exception(Message.PHONE_INVALID);
        }
    }

    // Kiểm tra định dạng email hợp lệ
    public static void isValidEmail(String email) throws Exception {
        if (!email.matches("^[A-Za-z0-9+_.-]+@(.+)$")) {
            throw new Exception(Message.EMAIL_INVALID);
        }
    }

    // Kiểm tra định dạng ngày tháng hợp lệ (dd/MM/yyyy)
    public static void checkDate(String input) throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        // Không cho phép tự động chuyển đổi ngày không hợp lệ (vd: 32/14)
        sdf.setLenient(false);
        sdf.parse(input);
    }
}

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

    public static void checkEmpty(String input) throws Exception {
        if (input == null || input.trim().isEmpti()) {
            throw new Exception(Message.INPUT_INVALID);
        }

    }

    public static void isValidPhone(String phone) throws Exception {
        if (!phone.matches("\\d{10,11}")) {
            throw new Exception(Message.PHONE_INVALID);
        }
    }

    public static void isValidEmail(String email) throws Exception {
        if (!email.matches("^[A-Za-z0-9+_.-]+@(.+)$")) {
            throw new Exception(Message.EMAIL_INVALID);
        }
    }

    public static void checkDate(String input) throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        sdf.setLenient(false);
        sdf.parse(input);
    }
}

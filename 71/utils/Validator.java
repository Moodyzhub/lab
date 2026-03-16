/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

import constant.Message;
import java.text.SimpleDateFormat;

/**
 *
 * @author phatvv
 */
public final class Validator {

    private Validator() {
    }

    // Kiểm tra input không được để trống
    public static void checkEmpty(String input) throws Exception {
        if (input == null || input.trim().isEmpty()) {
            throw new Exception(Message.INPUT_INVALID);
        }

    }

    // Ép kiểu đầu vào thành số nguyên báo lỗi nếu sai đinh dạng
    public static int parseInt(String input) throws Exception {
        int result;
        try {
            result = Integer.parseInt(input);
        } catch (Exception e) {
            throw new Exception(Message.INTEGER_INVALID);
        }
        if (result < 1 || result > 4) {
            throw new Exception(Message.TASK_TYPE_INVALID);
        }
        return result;
    }

    // Ép kiểu đầu vào thành số thực báo lỗi nếu sai định dạng
    public static double parseDouble(String input) throws Exception {
        try {
            return Double.parseDouble(input);
        } catch (Exception e) {
            throw new Exception(Message.DOUBLE_INVALID);
        }
    }

    // Kiểm tra định dạng ngày tháng hợp lệ không
    public static void checkDate(String input) throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        sdf.setLenient(false);
        sdf.parse(input);
    }

    // Kiểm tra khoảng thời gian làm việc phải thuộc [8.0 - 17.5] và chia hết cho 0.5
    public static void checkTime(double value) throws Exception {
        if (value < 8.0 || value > 17.5) {
            throw new Exception(Message.TIME_INVALID);
        }
        if ((value * 10) % 5 != 0) {
            throw new Exception(Message.STEP_INVALID);
        }
    }

    // Kiểm tra sự logic của thời gian (to lớn hơn from)
    public static void checkTime(double planFrom, double planTo) throws Exception {
        checkTime(planTo);
        if (planTo <= planFrom) {
            throw new Exception(Message.PLANT_TOFROM_INVALID);
        }
    }
}

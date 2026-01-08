package utils;

import java.util.Scanner;

public class Validation {
    // Scanner dùng cho toàn bộ ứng dụng
    private static final Scanner sc = new Scanner(System.in);

    // Hàm nhập số nguyên với giới hạn min, max
    public static int getInt(String msg, int min, int max) {
        // Vòng lặp vô hạn, chỉ dừng khi nhập đúng
        while (true) {
            try {
                System.out.print(msg);
                // Đọc toàn bộ dòng và chuyển sang số nguyên
                int n = Integer.parseInt(sc.nextLine());

                // Kiểm tra phạm vi
                if (n >= min && n <= max) {
                    return n;
                }
                System.err.println("Please input number in range [" + min + ", " + max + "]");
            } catch (Exception e) {
                // Xử lý lỗi nếu người dùng nhập chữ thay vì số
                System.err.println("Invalid input, please input a number!");
            }
        }
    }

    // Hàm nhập chuỗi kí tự (không được để trống)
    public static String getString(String msg) {
        while (true) {
            System.out.print(msg);
            String s = sc.nextLine().trim(); // Xóa khoảng trắng đầu/cuối

            if (!s.isEmpty()) {
                return s;
            }
            System.err.println("Input cannot be empty!");
        }
    }

    // Hàm nhập số thực (float) cho diện tích
    public static float getFloat(String msg) {
        while (true) {
            try {
                System.out.print(msg);
                float f = Float.parseFloat(sc.nextLine());

                // Kiểm tra thêm điều kiện > 0
                if (f > 0)
                    return f;
                System.err.println("Area must be greater than 0!");
            } catch (Exception e) {
                System.err.println("Invalid input, please input a number!");
            }
        }
    }
}

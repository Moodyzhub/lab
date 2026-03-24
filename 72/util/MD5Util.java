/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import java.security.MessageDigest;
// import jdk.jshell.Snippet;

/**
 *
 * @author huyca
 */
public final class MD5Util {

    private MD5Util() {
    }

    // Phương thức mã hóa mật khẩu sử dụng hàm băm MD5
    public static String encrypt(String input) throws Exception {
        try {
            // Khởi tạo đối tượng MessageDigest với thuật toán MD5
            MessageDigest md = MessageDigest.getInstance("MD5");
            // Thực hiện băm chuỗi đầu vào (đã chuyển sang mảng byte)
            byte[] hash = md.digest(input.getBytes());
            StringBuilder sb = new StringBuilder();
            
            // Chuyển đổi mảng byte sang chuỗi Hexa (Cơ số 16)
            for (byte b : hash) {
                sb.append(String.format("%02x", b));
            }
            return sb.toString();
        } catch (Exception e) {
            throw new Exception("MD5 error");
        }
    }
}

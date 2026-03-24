/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package constanst;

/**
 * Lớp chứa các hằng số thông báo (Messages) tĩnh cho toàn bộ chương trình
 * @author huyca
 */
public final class Message {

    private Message() {
    }

    // Các thông báo lỗi và thành công Constants
    public static final String INPUT_INVALID = "Input cannot empty";
    public static final String PHONE_INVALID = "Phone number must be 10 or 11 number.";
    public static final String EMAIL_INVALID = "Email is valid format";
    public static final String DATE_INVALID = "Date of birth is valid format dd/MM/yyyy.";
    public static final String NAME_EXIST = "Username already exists.";
    public static final String RE_SUCCESS = "Register success";
    public static final String CHANGE_PASS = "Do you want change password now? Y/N: ";
    public static final String COMFIRM_PASS = "Confirm password not match!";

    
    
}

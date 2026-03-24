/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

import controller.AccountController;
import dto.AccountRequestDTO;
import java.util.Scanner;
import util.MD5Util;
import util.Validator;
import constanst.Message;

/**
 *
 * @author huyca
 */
public class J1SP0072 {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        AccountController controller = new AccountController();

        // Vòng lặp chính của chương trình, hiển thị menu
        while (true) {
            System.out.println("====== LOGIN PROGRAM ======");
            System.out.println("1. Add User");
            System.out.println("2. Login");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");
            int choice = Integer.parseInt(sc.nextLine());
            
            // Xử lý các lựa chọn từ người dùng
            switch (choice) {
                // Case 1: Xử lý chức năng thêm người dùng (Add User)
                case 1: {
                    String username;
                    // Vòng lặp yêu cầu nhập và kiểm tra username
                    while (true) {
                        try {
                            System.out.print("Username: ");
                            username = sc.nextLine();

                            Validator.checkEmpty(username);

                            if (controller.isUsernameExist(username)) {
                                System.out.println(Message.NAME_EXIST);
                                continue;
                            }

                            break;

                        } catch (Exception e) {
                            System.out.println(e.getMessage());
                        }
                    }
                    String password;
                    // Vòng lặp yêu cầu nhập và kiểm tra mật khẩu
                    while (true) {
                        try {
                            System.out.print("Password: ");
                            password = sc.nextLine();
                            Validator.checkEmpty(password);
                            // Mã hoá mật khẩu bằng MD5
                            password = MD5Util.encrypt(password);
                            break;

                        } catch (Exception e) {
                            System.out.println(e.getMessage());
                        }
                    }
                    String name;
                    // Vòng lặp yêu cầu nhập và kiểm tra tên người dùng
                    while (true) {
                        try {
                            System.out.print("Name: ");
                            name = sc.nextLine();
                            Validator.checkEmpty(name);
                            break;

                        } catch (Exception e) {
                            System.out.println(e.getMessage());
                        }
                    }
                    String phone;
                    while (true) {
                        try {
                            System.out.print("Phone: ");
                            phone = sc.nextLine();
                            Validator.isValidPhone(phone);
                            break;

                        } catch (Exception e) {
                            System.out.println(e.getMessage());
                        }
                    }
                    String email;
                    while (true) {
                        try {
                            System.out.print("Email: ");
                            email = sc.nextLine();
                            Validator.isValidEmail(email);
                            break;
                        } catch (Exception e) {
                            System.out.println(e.getMessage());
                        }
                    }
                    System.out.print("Address: ");
                    String address = sc.nextLine();
                    String dob;
                    while (true) {
                        try {
                            System.out.print("DOB (dd/MM/yyyy): ");
                            dob = sc.nextLine();
                            Validator.checkDate(dob);
                            break;
                        } catch (Exception e) {
                            System.out.println(Message.DATE_INVALID);
                        }
                    }
                    
                    // Khởi tạo DTO và lưu trữ người dùng thông qua controller
                    AccountRequestDTO dto = new AccountRequestDTO(username, password, name, phone, email, address, dob);
                    controller.addAccount(dto);
                    System.out.println(Message.RE_SUCCESS);
                    break;
                }
                // Case 2: Xử lý chức năng đăng nhập
                case 2: {

                    System.out.print("Username: ");
                    String u = sc.nextLine();

                    System.out.print("Password: ");
                    String p = sc.nextLine();

                    p = MD5Util.encrypt(p);

                    controller.login(u, p);

                    System.out.print(Message.CHANGE_PASS);
                    String option = sc.nextLine();

                    if (option.equalsIgnoreCase("Y")) {

                        System.out.print("Old password: ");
                        String oldPass = sc.nextLine();

                        System.out.print("New password: ");
                        String newPass = sc.nextLine();

                        System.out.print("Renew password: ");
                        String renew = sc.nextLine();

                        if (!newPass.equals(renew)) {
                            System.out.println(Message.COMFIRM_PASS);
                            break;
                        }

                        oldPass = MD5Util.encrypt(oldPass);
                        newPass = MD5Util.encrypt(newPass);

                        controller.changePassword(u, oldPass, newPass);

                    }

                    break;
                }
                // Case 3: Thoát chương trình
                case 3:
                    return;
                default:
                    System.out.println("Invalid option!");
            }
        }
    }
}

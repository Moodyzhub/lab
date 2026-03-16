
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.j1.s.p0071;

import constant.Message;
import controller.TaskController;
import dto.TaskRequestDTO;
import java.util.Scanner;
import utils.Validator;

/**
 *
 * @author phatvv
 */
public class J1SP0071 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TaskController controller = new TaskController();
        // Vòng lặp chính của chương trình
        boolean running = true;
        while (running) {
            System.out.println("========= Task Program =========");
            System.out.println("1. Add Task");
            System.out.println("2. Delete Task");
            System.out.println("3. Display Task");
            System.out.println("4. Exit");
            System.out.print("Choose: ");
            String choice = sc.nextLine();
            // Xử lý các chức năng dựa trên lựa chọn của người dùng
            switch (choice) {
                // Thêm task mới
                case "1":
                    try {
                        String requirementName;
                        while (true) {
                            try {
                                System.out.print("Enter requirementName: ");
                                requirementName = sc.nextLine();
                                Validator.checkEmpty(requirementName);
                                break;
                            } catch (Exception e) {
                                System.out.println(e.getMessage());
                            }
                        }
                        int taskTypeId;
                        while (true) {
                            try {
                                System.out.print("Enter task type: ");
                                taskTypeId = Validator.parseInt(sc.nextLine());
                                break;
                            } catch (Exception e) {
                                System.out.println(e.getMessage());
                            }
                        }
                        String date;
                        while (true) {
                            try {
                                System.out.print("Enter date: ");
                                date = sc.nextLine();
                                Validator.checkEmpty(date);
                                Validator.checkDate(date);
                                break;
                            } catch (Exception e) {
                                System.out.println(Message.DATE_INVALID);
                            }
                        }
                        double planFrom;
                        while (true) {
                            try {
                                System.out.print("Enter from: ");
                                planFrom = Validator.parseDouble(sc.nextLine());
                                Validator.checkTime(planFrom);
                                break;
                            } catch (Exception e) {
                                System.out.println(e.getMessage());
                            }
                        }
                        double planTo;
                        while (true) {
                            try {
                                System.out.print("Enter to: ");
                                planTo = Validator.parseDouble(sc.nextLine());
                                Validator.checkTime(planFrom, planTo);
                                break;
                            } catch (Exception e) {
                                System.out.println(e.getMessage());
                            }
                        }

                        String assignee;
                        while (true) {
                            try {
                                System.out.print("Enter assignee: ");
                                assignee = sc.nextLine();
                                Validator.checkEmpty(assignee);
                                break;
                            } catch (Exception e) {
                                System.out.println(e.getMessage());
                            }
                        }
                        String reviewer;
                        while (true) {
                            try {
                                System.out.print("Enter reviewer: ");
                                reviewer = sc.nextLine();
                                Validator.checkEmpty(reviewer);
                                break;
                            } catch (Exception e) {
                                System.out.println(e.getMessage());
                            }
                        }
                        TaskRequestDTO dto = new TaskRequestDTO(requirementName, taskTypeId, date, planFrom, planTo,
                                assignee, reviewer);
                        controller.createTask(dto);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }

                    break;
                    // Xóa task theo ID
                case "2":
                    try {
                        System.out.print("Enter Task ID: ");
                        int id = Validator.parseInt(sc.nextLine());
                        controller.deleteTask(id);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }

                    break;
                    // Hiển thị thông tin tất cả task
                case "3":
                    try {
                        controller.getAllTasks();
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                    // Thoát và giải phóng bộ nhớ
                case "4":
                    running = false;
                    sc.close();
                    break;
                default:
                    throw new AssertionError();
            }
        }

    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import constant.Message;
import dto.TaskResponseDTO;
import java.util.List;

/**
 *
 * @author phatvv
 */
public class TaskView {

    private List<TaskResponseDTO> data;

    // Nhận dữ liệu task từ Controller để chuẩn bị in
    public void setData(List<TaskResponseDTO> data) {
        this.data = data;
    }

    // Hiển thị danh sách Task theo định dạng bảng
    public void render() {

        System.out.println("==========Task==========");

        System.out.printf("%-5s %-15s %-12s %-12s %-10s %-12s %-12s\n",
                "ID", "Name", "Task Type", "Date", "Time", "Assignee", "Reviewer");

        for (TaskResponseDTO dto : data) {
            System.out.printf("%-5d %-15s %-12s %-12s %-10s %-12s %-12s\n",
                    dto.getId(),
                    dto.getRequirementName(),
                    dto.getTaskTypeName(),
                    dto.getDate(),
                    dto.getTime(),
                    dto.getAssignee(),
                    dto.getReviewer());
        }
    }

    // Hiển thị kết quả thêm thành công
    public void showAddSuccess() {
        System.out.println(Message.ADD_SUCCESS);
    }

    // Hiển thị kết quả xóa thành công
    public void showDeleteSuccess() {
        System.out.println(Message.DELETE_SUCCESS);
    }
}

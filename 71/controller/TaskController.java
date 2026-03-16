/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import dto.TaskRequestDTO;
import dto.TaskResponseDTO;
import java.util.List;
import service.TaskService;
import view.TaskView;

/**
 *
 * @author phatvv
 */
public class TaskController {

    private final TaskService service;
    private final TaskView view;
 
    public TaskController() {
        service = new TaskService();
        view = new TaskView();
    }

    // Nhận DTO từ view/dữ liệu và gọi Service để thêm Task
    public void createTask(TaskRequestDTO dto) throws Exception {
        service.createTask(dto);
        view.showAddSuccess();
    }

    // Gọi Service xóa Task và báo kết quả ra View
    public void deleteTask(int id) throws Exception {
        service.deleteTask(id);
        view.showDeleteSuccess();
    }

    // Lấy danh sách nhiệm vụ qua Service và truyền sang View để hiển thị
    public void getAllTasks() throws Exception {
        List<TaskResponseDTO> list = service.getAllTasks();
        view.setData(list);
        view.render();
    }
}

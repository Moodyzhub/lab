/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import dto.TaskRequestDTO;
import dto.TaskResponseDTO;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import model.Task;
import model.TaskType;

/**
 *
 * @author phatvv
 */
public class TaskRepository {

    // Lưu trữ danh sách task trong bộ nhớ với key là ID và value là Task object
    private final Map<Integer, Task> taskMap = new HashMap<>();

    // thêm thông tin của Task vào cấu trúc dữ liệu Map
    public void add(TaskRequestDTO dto, int id) throws Exception {
        //Convert taskTypeId thành TaskType enum
        TaskType type = TaskType.fromId(dto.getTaskTypeId());
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        
        // Tạo đối tượng Task từ DTO với việc chuyển đổi dữ liệu:
        // Parse string date thành Date object
        Task task = new Task(
                id,
                type,
                dto.getRequirementName(),
                sdf.parse(dto.getDate()),
                dto.getPlanFrom(),
                dto.getPlanTo(),
                dto.getAssignee(),
                dto.getReviewer()
        );

        taskMap.put(id, task);
    }

    // Kiểm tra xem ID của Task đã có trong Map chưa
    public boolean exists(int id) {
        return taskMap.containsKey(id);
    }

    // Xóa một dữ liệu task cụ thể qua ID
    public void delete(int id) {
        taskMap.remove(id);
    }

    // Trả về danh sách tất cả các task hiện tại
    public List<Task> findAll() {
        return new ArrayList<>(taskMap.values());
    }
}

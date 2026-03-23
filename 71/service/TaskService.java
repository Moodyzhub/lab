package service;

import constant.Message;
import dto.TaskRequestDTO;
import dto.TaskResponseDTO;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import model.Task;
import repository.TaskRepository;

/**
 *
 * @author phatvv
 */
public class TaskService {

    private final TaskRepository repository;

    public TaskService() {
        repository = new TaskRepository();
    }

    // Thêm task mới thông qua Repository (ID được quản lý tự động trong Repository)
    public void createTask(TaskRequestDTO dto) throws Exception {
        repository.add(dto);
    }

    // Kiểm tra id có tồn tại không trước khi yêu cầu Repository xóa
    public void deleteTask(int id) throws Exception {
        boolean exists = repository.exists(id);
        if (exists == false) {
            throw new Exception(Message.ID_NOTFOUND);
        }
        repository.delete(id);
    }

    // Lấy toàn bộ thông tin công việc, định dạng thời gian và lưu vào ResponseDTO
    public List<TaskResponseDTO> getAllTasks() throws Exception {

        List<Task> taskList = repository.findAll();

        List<TaskResponseDTO> responseList = new ArrayList<>();

        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

        for (Task task : taskList) {

            // String time = task.getPlanFrom() + " - " + task.getPlanTo();
            double time = task.getPlanTo() - task.getPlanFrom();

            TaskResponseDTO dto = new TaskResponseDTO(
                    task.getId(),
                    task.getRequirementName(),
                    task.getTaskType().getName(),
                    sdf.format(task.getDate()),
                    time,
                    task.getAssignee(),
                    task.getReviewer());

            responseList.add(dto);
        }

        return responseList;
    }

}

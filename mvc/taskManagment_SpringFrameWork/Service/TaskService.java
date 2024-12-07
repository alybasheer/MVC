package taskManagment_SpringFrameWork.Service;

import org.springframework.stereotype.Service;
import taskManagment_SpringFrameWork.model.Task;

@Service
public class TaskService {
    private Task task;

    public TaskService() {
        // Create an initial task
        this.task = new Task(1, "Complete Assignment", "Finish the MVC assignment by tomorrow.", false);
    }

    public Task getTask() {
        return task;
    }

    public void updateTask(Task updatedTask) {
        this.task = updatedTask;
    }
}

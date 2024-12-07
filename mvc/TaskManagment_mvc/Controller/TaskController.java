package TaskManagment_mvc.Controller;

import TaskManagment_mvc.Model.Task;
import TaskManagment_mvc.View.TaskView;

public class TaskController {
    private Task task;
    private TaskView view;

    public TaskController(Task task, TaskView view) {
        this.task = task;
        this.view = view;
    }

    // Methods to update task data
    public void setTaskTitle(String title) {
        task.setTitle(title);
    }

    public void setTaskDescription(String description) {
        task.setDescription(description);
    }

    public void setTaskCompletion(boolean completed) {
        task.setCompleted(completed);
    }

    // Methods to retrieve task data
    public String getTaskTitle() {
        return task.getTitle();
    }

    public String getTaskDescription() {
        return task.getDescription();
    }

    public boolean isTaskCompleted() {
        return task.isCompleted();
    }

    // Update View
    public void updateView() {
        view.displayTaskDetails(task.getId(), task.getTitle(), task.getDescription(), task.isCompleted());
    }
}

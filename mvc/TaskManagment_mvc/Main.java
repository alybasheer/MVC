package TaskManagment_mvc;

import TaskManagment_mvc.Model.Task;
import TaskManagment_mvc.View.TaskView;
import TaskManagment_mvc.Controller.TaskController;

public class Main {
    public static void main(String[] args) {
        // Create a Task object
        Task task = new Task(1, "Complete Assignment", "Finish the MVC assignment by tomorrow.", false);

        // Create a View object
        TaskView view = new TaskView();

        // Create a Controller object
        TaskController controller = new TaskController(task, view);

        // Display initial task details
        controller.updateView();

        // Update task details
        controller.setTaskTitle("Complete MVC Assignment");
        controller.setTaskDescription("Finish coding and submit by tonight.");
        controller.setTaskCompletion(true);

        // Display updated task details
        controller.updateView();
    }
}

package taskManagment_SpringFrameWork.controller;

import taskManagment_SpringFrameWork.model.Task;
import taskManagment_SpringFrameWork.Service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TaskController {
    @Autowired
    private TaskService taskService;

    @GetMapping("/")
    public String viewTask(Model model) {
        Task task = taskService.getTask();
        model.addAttribute("task", task);
        return "TaskView";
    }

    @PostMapping("/update")
    public String updateTask(
            @RequestParam String title,
            @RequestParam String description,
            @RequestParam boolean completed,
            Model model) {
        Task updatedTask = new Task(1, title, description, completed);
        taskService.updateTask(updatedTask);
        model.addAttribute("task", updatedTask);
        return "TaskView";
    }
}

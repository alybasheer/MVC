package TaskManagment_mvc.View;

public class TaskView {
    public void displayTaskDetails(int id, String title, String description, boolean completed) {
        System.out.println("Task ID: " + id);
        System.out.println("Title: " + title);
        System.out.println("Description: " + description);
        System.out.println("Completed: " + (completed ? "Yes" : "No"));
    }
}

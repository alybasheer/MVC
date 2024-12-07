package General_mvc.Controller;
// Controller.java
public class Controller {
    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void updateData(String newData) {
        model.setData(newData);
        view.display(model.getData());
    }
}

import java.util.ArrayList;

public class TaskGestor {
    private ArrayList<Task> list = new ArrayList<>();

    public void add(String desc) {
        list.add(new Task(desc));
    }

    public ArrayList<Task> getList() {
        return list;
    }
}
import java.util.ArrayList;

public class TaskGestor {
    private ArrayList<Task> list = new ArrayList<>();

    public void add(String desc) {
        list.add(new Task(desc));
    }

    public ArrayList<Task> getList() {
        return list;
    }
    

    public boolean delete(int index) {
        if (index >= 0 && index < list.size()) {
            list.remove(index);
            return true;
        }
        return false;
    }

}
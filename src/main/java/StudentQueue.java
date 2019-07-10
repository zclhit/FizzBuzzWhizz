import java.util.ArrayList;
import java.util.List;

public class StudentQueue {
    private List<Student> queue = new ArrayList<>();

    public void addStudent(Student student) {
        queue.add(student);
    }

    public void callTheRoll() {
        queue.forEach(s -> System.out.println(s.speak()));
    }
}

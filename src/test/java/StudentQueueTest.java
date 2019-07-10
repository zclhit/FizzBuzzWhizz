import org.junit.Before;
import org.junit.Test;

public class StudentQueueTest {
    private StudentQueue queue;

    @Before
    public void setUp() {
        queue = new StudentQueue();
    }

    @Test
    public void should_print_target_queue_in_sequence() {
        for (int i =1; i<=100; i++) {
            queue.addStudent(new Student(i));
        }
        queue.callTheRoll();
    }

}

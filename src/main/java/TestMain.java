public class TestMain {
    public static void main(String[] args) {
        StudentQueue queue = new StudentQueue();
        for (int i =1; i<=100; i++) {
            queue.addStudent(new Student(i));
        }
        queue.callTheRoll();
    }
}

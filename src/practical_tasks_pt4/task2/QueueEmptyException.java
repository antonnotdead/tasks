package practical_tasks_pt4.task2;

public class QueueEmptyException extends Exception {
    public QueueEmptyException() {
        super("Queue is empty");
    }
}

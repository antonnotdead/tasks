package practical_tasks_pt4.task2;

public class Main {
    public static void main(String[] args) {
        Queue<Integer> q = new Queue<>(0);
        // q.set(2);
        try {
            System.out.print(q.get(0));
        } catch (QueueEmptyException e) {

            e.printStackTrace();
        }
    }
}

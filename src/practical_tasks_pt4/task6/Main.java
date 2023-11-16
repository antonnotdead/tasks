package practical_tasks_pt4.task6;

public class Main {
    public static void main(String[] args) {
        NewOldThread oldThread1 = new NewOldThread();
        NewOldThread oldThread2 = new NewOldThread();
        NewOldThread oldThread3 = new NewOldThread();

        Thread first = new Thread(oldThread1);
        Thread second = new Thread(oldThread2);
        Thread third = new Thread(oldThread3);

        first.start();
        second.start();
        third.start();
    }
}
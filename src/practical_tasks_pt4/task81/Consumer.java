package practical_tasks_pt4.task81;

import java.util.Objects;

public class Consumer<T extends Sortable> implements Runnable {
    private MyQueue<T> myQueue;

    public Consumer(MyQueue<T> myQueue) {
        this.myQueue = myQueue;
    }

    @Override
    public void run() {
        while (true) {
            T t = myQueue.get();
            if (t != null) {
                t.sort();
            }
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Consumer<?> consumer = (Consumer<?>) o;

        return myQueue != null ? myQueue.equals(consumer.myQueue) : consumer.myQueue == null;
    }

    @Override
    public int hashCode() {
        return myQueue!= null ? myQueue.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Consumer{" +
                "name=\'" + Thread.currentThread().getName() + '\'' +
                "myQueue=" + myQueue +
                '}';
    }
}

package practical_tasks_pt4.task2;

public class Queue<T> {
    private int size;
    private T[] queue;
    private int pos;

    public Queue(int size) {
        this.size = size;
        this.pos = 0;
        queue = (T[]) new Object[size];
    }

    public void set(T el) {
        if (pos > size - 1) {
            throw new IndexOutOfBoundsException();
        } else {
            if (size < 1) {
                queue[pos] = el;
                pos++;
            } else {
                queue[pos] = el;
                pos++;
            }
        }
    }

    public T get(int index) throws QueueEmptyException {
        if (size == 0) {
            throw new QueueEmptyException();
        }
        if (index > size - 1) {
            throw new IndexOutOfBoundsException();
        } else {
            return queue[index];
        }
    }


}

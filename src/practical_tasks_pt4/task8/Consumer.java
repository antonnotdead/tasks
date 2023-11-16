package practical_tasks_pt4.task8;
public class Consumer implements Runnable{
    private MyQueue myQueue;

    public Consumer(MyQueue myQueue){
        this.myQueue = myQueue;
    }

    public void run(){
        for (int i = 0; i < 100; i++){
            myQueue.get();
        }
    }
}

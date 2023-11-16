package practical_tasks_pt4.task8;
public class MyQueue {
    private int n;
    boolean valueSet = false;

    public synchronized int get(){
        while (!valueSet){
            try{
                wait();
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println("Get: " + n);
        valueSet = false;
        notify();
        return n;
    }

    public synchronized void put(int n){
        while (valueSet){
            try{
                wait();
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        valueSet = true;
        this.n = n;
        System.out.println("Send: " + n);
        notify();
    }
}

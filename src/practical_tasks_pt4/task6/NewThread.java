package practical_tasks_pt4.task6;

public class NewThread extends Thread{
    public void run(){
        for (int i=0; i<100;i++){
            System.out.println("☹");
        }
    }
}

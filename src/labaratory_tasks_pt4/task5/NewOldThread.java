package labaratory_tasks_pt4.task5;


public class NewOldThread implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 101; i++){
            if (i % 10 == 0) {
                System.out.println("Number " + i);
            }
            try{
                Thread.sleep(100);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println("Thread is over");
    }
}

package practical_tasks_pt4.task7;

public class MyThread extends Thread{
    private StringBuilder sb;
    public MyThread(StringBuilder sb){
        this.sb =sb;
    }
    public void run(){
        synchronized (sb){
            for (int i =0; i < 100; i++){
                System.out.println(sb);
            }
            char symbol = sb.charAt(0);
            sb.setCharAt(0, ++symbol);
        }
    }
}

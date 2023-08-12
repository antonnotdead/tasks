package labaratory_tasks_pt1.task9;

public class Main {
    public static void main(String[] args){
        int time = (int)(Math.random()*28801);
        int hours = time/3600;
        System.out.println(time);
        if (hours == 0){
            System.out.println("Less than an hour left");
        } else {
            System.out.println(hours + " hours left");
        }

    }
}

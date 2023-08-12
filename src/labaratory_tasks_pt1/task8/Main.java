package labaratory_tasks_pt1.task8;

public class Main {
    public static void main(String[] args){
        int rnum = (int)((Math.random() * 150)+5);
        if (25 < rnum && rnum < 100){
            System.out.println("Number " + rnum + " is in range");
        } else {
            System.out.println("Number " + rnum + " is not in range");
        }

    }
}

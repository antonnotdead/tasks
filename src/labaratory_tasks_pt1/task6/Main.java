package labaratory_tasks_pt1.task6;

public class Main {
    public static void main(String[] args){
        int a = 1, b =1;
        System.out.println(a);
        for (int i=0; i < 5; i++){
            a += b;
            System.out.println(a);
            b += a;
            System.out.println(b);
        }
    }
}

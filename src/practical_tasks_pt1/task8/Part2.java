package practical_tasks_pt1.task8;

import java.util.Scanner;

public class Part2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        boolean bool = true;
        while (bool){
            if(!(a < b)){
                System.out.println("Try again!");
                a = scanner.nextInt();
                b = scanner.nextInt();
            }
            else{
                bool =false;
            }
            System.out.println((int)(Math.random()*(a+b))-a);
        }
    }
}

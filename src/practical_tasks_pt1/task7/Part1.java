package practical_tasks_pt1.task7;

import java.util.Scanner;

public class Part1 {
    public static void main(String[] args){
        boolean bool = true;
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        while (bool){
            if (a <= 0 || b <=0){
                System.out.println("Try again!");
                a = sc.nextInt();
                b = sc.nextInt();
            }else{
                bool = false;
            }

        }
        System.out.println("Square = "+ a*b);
        System.out.println("Perimetr = " + 2*(a+b));
    }
}

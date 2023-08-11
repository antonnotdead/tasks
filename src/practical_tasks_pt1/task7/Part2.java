package practical_tasks_pt1.task7;

import java.util.Scanner;

public class Part2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int digits = 0;
        int n = sc.nextInt();
        boolean bool = true;
        while (bool){
            if (n <= 0){
                System.out.println("Try again!");
                n = sc.nextInt();
            }
            else {
                bool = false;
            }
        }
        int n_t = n;
        while (n_t != 0){
            digits++;
            n_t /= 10;
        }
        System.out.println(digits);
    }
}

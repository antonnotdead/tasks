package labaratory_tasks_pt1.task11;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n;
        while (true){
            n = sc.nextInt();
            if (n > 3){
                break;
            }
            System.out.println("try again!");

        }
        int[] mas = new int[n];

        int even = 0;
        for (int i = 0; i <n; i++){
           mas[i] = (int)(Math.random()*n);
           System.out.print(mas[i] + " ");
           if (mas[i] % 2 == 0){
               even++;
           }
        }
        System.out.println();
        if (even == 0){
           System.out.println("There are no any even numbers");
        }
        else {
            int[] e_mas = new int[even];
            for (int i = 0; i < n; i++){
                if(mas[i] % 2 == 0){
                    e_mas[even-1] = mas[i];
                    System.out.print(e_mas[even-1]+ " ");
                    even--;
                }
            }
        }

    }
}

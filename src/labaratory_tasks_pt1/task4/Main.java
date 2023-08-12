package labaratory_tasks_pt1.task4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int random_num = (int)((Math.random()*9)+1);
        Scanner sc = new Scanner(System.in);
        int user_num;
        System.out.println("Enter you number:");
        while (true){
            user_num = sc.nextInt();
            if(user_num > random_num){
                System.out.println("Lower! Try again!");
            } else if (user_num < random_num) {
                System.out.println("Higher! Try again!");
            }else {
                System.out.println("You are right!");
                break;
            }
        }
    }
}

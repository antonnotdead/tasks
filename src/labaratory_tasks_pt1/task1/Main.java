package labaratory_tasks_pt1.task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i < 4; i++){
            System.out.println((int)Math.pow(n, i+1));
        }
    }
}

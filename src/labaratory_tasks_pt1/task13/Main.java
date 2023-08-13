package labaratory_tasks_pt1.task13;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        int mas[][] = new int[n][m];
        int temp_index;
        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                mas[i][j] = (int)(Math.random()*101)-50;
                System.out.print(mas[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < n; i++){
            for (int j = 0; j<m-1; j++){
                if (mas[i][j] < mas[i][j+1]){
                    temp_index = j+1;
                }
            }
        }

    }
}

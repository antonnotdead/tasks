package labaratory_tasks_pt1.task13;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        int[][] mas = new int[n][m];
        int max_index = 0;
        int min_index = m-1;
        int temp;
        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                mas[i][j] = (int)(Math.random()*101)-50;
                System.out.print(mas[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < n; i++){
            for (int j = 0; j<m-1; j++){
                if (mas[i][max_index] < mas[i][j+1]){
                    max_index = j+1;
                }
            }
            temp = mas[i][max_index];
            mas[i][max_index] = mas[i][0];
            mas[i][0] = temp;
            max_index = 0;
            for (int k = m-1; k >= 0; k--){
                if (mas[i][min_index] > mas[i][k-1]){
                    min_index = k;
                }
            }
            temp = mas[i][min_index];
            mas[i][min_index] = mas[i][0];
            mas[i][0] = temp;
            min_index = m-1;
        }
        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                System.out.print(mas[i][j] + " ");
            }
            System.out.println();
        }
    }
}

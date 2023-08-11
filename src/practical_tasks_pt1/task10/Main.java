package practical_tasks_pt1.task10;

public class Main {
    public static void main(String[] args){
        int m = 4;
        int n = 7;
        int[][] mas;
        int t = 1;
        int new_t = 1;
        int num = 1;
        mas = new int[m][n];
        for (int i = 0; i < m; i++){
            for (int j = 0; j <n; j++){
               mas[i][j] = (int)(Math.random()*11)-5;
            }
        }
        for (int i = 0; i < m; i++){
            for (int j = 0; j <n; j++){
                System.out.print(mas[i][j] + "\t");
            }
            System.out.println();
        }
        for (int i = 0; i < n; i++){
            for (int j = 0; j <m; j++){
                t *= mas[j][i];
            }
            if (t > new_t){
                new_t= t;
                t = 1;
                num = i+1;
            }

        }
        System.out.println("\n"+num);
    }
}

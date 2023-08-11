package practical_tasks_pt1.task10;

public class Main {
    public static void main(String[] args){
        int m = 4, n = 7, mas[][];
        int t = 1;
        int new_t = 1;
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
                t *= mas[i][j];
            }
            if (t > new_t){

            }
        }


    }
}

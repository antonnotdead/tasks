package labaratory_tasks_pt1.task12;

public class Main {
    public static void main(String[] args){
        int m = 15, n =2;
        int[][] mas = new int[m][n];
        mas[0][0] = (int)(Math.random()*8)+2;
        mas[0][1] = (int)(Math.random()*8)+2;
        for (int i = 1; i < 15; i ++){
            mas[i][0] = (int)(Math.random()*8)+2;
            mas[i][1] = (int)(Math.random()*8)+2;
            for (int j = 0; j < i; j++){
                if (mas[i][0] == mas[j][0] && mas[i][1] == mas[j][1]){
                    i--;
                }
                if (mas[i][1] == mas[j][0] && mas[i][0] == mas[j][1]){
                    i--;
                }
            }
        }
        for (int i = 0; i < m; i++) {
            System.out.println(mas[i][0]+ "x" + mas[i][1] + "=");
        }
    }
}

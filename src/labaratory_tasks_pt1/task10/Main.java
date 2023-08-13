package labaratory_tasks_pt1.task10;

public class Main {
    public static void main(String[] args){
        int[] mas = new int[12];
        int result = 0;
        int max = -16;
        for(int i = 0; i <12; i++){
            mas[i] = (int)((Math.random()*31)-15);
            System.out.print(mas[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < 12; i++){
            if (max <= mas[i]){
                max = mas[i];
                result = i;
            }
        }
        System.out.println(result);
    }
}

package practical_tasks_pt1.task9;

public class Part1 {
    public static void main(String[] args){
        int[] mas = new int[100];
        for (int i =1; i <=99; i++){
            mas[i] = i;
        }
        for (int i =1; i <=99; i++){
            System.out.print(mas[i] + " ");
        }
        System.out.println();
        for (int i =99; i >= 1; i--){
            System.out.print(mas[i] + " ");
        }
    }
}

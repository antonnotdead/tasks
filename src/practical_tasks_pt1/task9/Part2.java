package practical_tasks_pt1.task9;

public class Part2 {
    public static void main(String[] args){
        int amount = 0;
        int[] mas = new int[15];
        for (int i = 0; i < 15; i++){
            mas[i] = (int)(Math.random()*10);
        }
        for (int i =0; i <15; i++){
            System.out.print(mas[i] + " ");
            if (mas[i] % 2 == 0){
                amount++;
            }
        }
        System.out.println("\n" + amount);
    }
}

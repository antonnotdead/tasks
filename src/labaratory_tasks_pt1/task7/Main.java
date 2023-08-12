package labaratory_tasks_pt1.task7;

public class Main {
    public static void main(String[] args){
        int half1;
        int half2;
        int amount = 0;
        for(int i = 100001; i <= 999999; i++){
            half1 = i / 1000;
            half2 = i % 1000;
            if (sum3(half1) == sum3(half2)){
                amount++;
            }
        }
        System.out.println(amount);
    }
    public static int sum3(int num){
        int sum = 0;
        for (int i = 1; i<=100; i *= 10){
            sum += (num/i) % 10;
        }
        return sum;
    }
}

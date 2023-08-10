package practical_tasks_pt1.task6;

import java.util.Scanner;

public class Part4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        boolean bool = true;
        while (bool){
            int month = sc.nextInt();
            switch (month) {
                case 1, 2, 12 -> {
                    System.out.println("Winter");
                    bool = false;
                }
                case 3, 4, 5 -> {
                    System.out.println("Spring");
                    bool = false;
                }
                case 6, 7, 8 -> {
                    System.out.println("Summer");
                    bool = false;
                }
                case 9, 10, 11 -> {
                    System.out.println("Autumn");
                    bool = false;
                }
                default -> System.out.println("Try again!");
            }
        }
    }
}

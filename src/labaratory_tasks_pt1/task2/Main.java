package labaratory_tasks_pt1.task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        String password = "xO2dxdVOL3";
        String pass;

        Scanner sc_str = new Scanner(System.in);

        System.out.println("ENTER THE PASSWORD:");
        while (true){
            pass = sc_str.nextLine();
            if (pass.equals(password)){
                System.out.println("Match!");
                break;
            }
            else {
                System.out.println("Try again!");
            }
        }
    }
}

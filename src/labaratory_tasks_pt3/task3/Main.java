package labaratory_tasks_pt3.task3;
public class Main {
    public static void main(String[] args) {
        Apple apple1 = new Apple();
        Apple apple2 = new Apple();
        Pee pee1 = new Pee();
        Pee pee2 = new Pee();
        Plum plum1 = new Plum();
        Plum plum2 = new Plum();

        apple1.fruitCost(10.3);
        apple2.fruitCost(0.5);

        System.out.println();

        pee1.fruitCost(10.3);
        pee2.fruitCost(0.5);

        System.out.println();

        plum1.fruitCost(10.3);
        plum2.fruitCost(0.5);
    }
}
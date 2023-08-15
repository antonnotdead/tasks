package practical_tasks_pt2.task9;

public class Main {
    public static void main(String[] args) {
        double squareside = 5.12;
        int circleradius = 22;
        double triangleside1 = 5.12, triangleside2=  6.1;
        System.out.println(OverloadC.square(squareside));
        System.out.println(OverloadC.square(circleradius));
        System.out.println(OverloadC.square(triangleside1, triangleside2));

    }
}

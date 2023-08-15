package practical_tasks_pt2.task9;

public class OverloadC {
    public static double square(double a){
        return a*a;
    }
    public static double square(int a){
        return a*a*3.14;
    }
    public static double square(double a, double b){
        return a*b/2;
    }

}

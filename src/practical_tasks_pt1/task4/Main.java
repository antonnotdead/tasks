package practical_tasks_pt1.task4;

public class Main {
    public static void main(String[] args){
        byte b;
        int i = 257;
        double d = 323.142;
        b = (byte)i;
        i = (int)d;
        System.out.println(b + "\n" + i);
        b = (byte)d;
        System.out.println(b);
    }
}

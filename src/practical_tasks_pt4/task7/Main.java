package practical_tasks_pt4.task7;

public class Main {
    public static void main(String[] args){
        StringBuilder symbol = new StringBuilder(1);
        symbol.append("g");
        MyThread firstTread = new MyThread(symbol);
        MyThread SecondTread = new MyThread(symbol);
        MyThread ThirdTread = new MyThread(symbol);

        firstTread.start();
        SecondTread.start();
        ThirdTread.start();
    }
}

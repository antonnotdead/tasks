package practical_tasks_pt3.task9;

public class Main {
    public static void main(String[] args){
        Instrument[] mass = {new Trumpet(5), new Guitar(6), new Drums(8.1),
        new Guitar(3), new Trumpet(), new Drums(5)};
        for (Instrument instrument : mass){
            instrument.play();
        }
    }
}

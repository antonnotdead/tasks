package practical_tasks_pt3.task9;

public class Guitar implements Instrument{
    private int guitarStrings;
    public Guitar(int guitarStrings){
        this.guitarStrings = guitarStrings;
    }
    public Guitar(){
        this.guitarStrings = 0;
    }
    public Guitar(Guitar ob){
        this.guitarStrings = ob.guitarStrings;
    }
    @Override
    public void play() {
        System.out.println("Guitar is playing! Amount of strings: " + this.guitarStrings);
    }
}

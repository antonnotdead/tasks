package practical_tasks_pt3.task9;

public class Trumpet implements Instrument{
    private int diameter;
    public Trumpet(int diameter){
        this.diameter = diameter;
    }

    public Trumpet(){
        this.diameter = 0;
    }
    public Trumpet(Trumpet ob){
        this.diameter = ob.diameter;
    }
    @Override
    public void play() {
        System.out.println("Trumpet is playing! Diameter: " + this.diameter);
    }
}

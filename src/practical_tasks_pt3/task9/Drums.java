package practical_tasks_pt3.task9;

public class Drums implements Instrument{
    private double size;
    public Drums(double size){
        this.size = size;
    }
    public Drums(){
        this.size = 0;
    }
    public Drums(Drums ob){
        this.size = ob.size;
    }
    @Override
    public void play() {
        System.out.println("Drums is playing! Size: " + this.size);
    }
}

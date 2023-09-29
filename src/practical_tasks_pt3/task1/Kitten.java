package practical_tasks_pt3.task1;

public class Kitten extends Cat{
    private String feedingTime;

    public Kitten(){
        super();
        this.feedingTime ="01.01.70";
    }
    public Kitten(int age, int weight, String name, int mice, String feedingTime){
        super(age, weight, name, mice);
        this.feedingTime = feedingTime;
    }
    public void setFeedingTime(String feedingTime) {
        this.feedingTime = feedingTime;
    }

    public String getFeedingTime() {
        return feedingTime;
    }

}

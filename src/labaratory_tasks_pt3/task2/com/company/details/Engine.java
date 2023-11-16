package labaratory_tasks_pt3.task2.com.company.details;

public class Engine {
    String manufacturer;
    double power;
    public Engine(String manufacturer, double power){
        this.manufacturer = manufacturer;
        this.power = power;
    }

    @Override
    public String toString(){
        return "Information about engine:\nEngine's manufacturer: " + manufacturer +
                "\n Engine's power: " + power;
    }
}

package labaratory_tasks_pt3.task2.com.company.vehicles;
import q2.com.company.details.Engine;
import q2.com.company.professions.Driver;

public class Lorry extends Car{
    double loadCapacity;
    public Lorry(String carBrand, String carClass, double weight, Driver driver, Engine engine, double loadCapacity) {
        super(carBrand, carClass, weight, driver, engine);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public String toString(){
        return "Information about lorry:\nLorry's brand: " + carBrand + "\nLorry's class: " + carClass +
                "\nLorry's weight: " + weight +
                "\nInformation about driver: " + driver +
                "\nInformation about engine: " + engine +
                "\nInformation about load capacity: " + loadCapacity;
    }
}

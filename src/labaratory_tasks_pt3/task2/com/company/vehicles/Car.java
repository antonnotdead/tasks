package labaratory_tasks_pt3.task2.com.company.vehicles;
import q2.com.company.professions.Driver;
import q2.com.company.details.Engine;

public class Car {
    String carBrand;
    String carClass;
    double weight;
    public Driver driver;
    public Engine engine;
    public Car(String carBrand, String carClass, double weight, Driver driver, Engine engine){
        this.carBrand = carBrand;
        this.carClass = carClass;
        this.weight = weight;
        this.driver = driver;
        this.engine = engine;
    }
    public void start(){
        System.out.println("Поехали");
    }
    public void stop(){
        System.out.println("Останавливаемся");
    }
    public void turnRight(){
        System.out.println("Поворот направо");
    }
    public void turnLeft(){
        System.out.println("Поворот налево");
    }

    @Override
    public String toString(){
        return "Information about car:\nCar brand: " + carBrand + "\nCar class: " + carClass +
                "\nCar weight: " + weight +
                "\nInformation about driver: " + driver +
                "\nInformation about engine: " + engine;
    }
}

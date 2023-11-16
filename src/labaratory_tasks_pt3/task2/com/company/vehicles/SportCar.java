package labaratory_tasks_pt3.task2.com.company.vehicles;
import q2.com.company.details.Engine;
import q2.com.company.professions.Driver;

public class SportCar extends Car{
    int limitSpeed;
    public SportCar(String carBrand, String carClass, double weight, Driver driver, Engine engine, int limitSpeed) {
        super(carBrand, carClass, weight, driver, engine);
        this.limitSpeed = limitSpeed;
    }

    @Override
    public String toString(){
        return "Information about sport car:\nSport car brand: " + carBrand + "\nSport car class: " + carClass +
                "\nSport car weight: " + weight +
                "\nInformation about driver: " + driver +
                "\nInformation about engine: " + engine +
                "\nInformation about limit speed: " + limitSpeed;
    }
}

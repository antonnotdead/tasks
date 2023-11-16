package labaratory_tasks_pt3.task2;
import q2.com.company.details.Engine;
import q2.com.company.professions.Driver;
import q2.com.company.vehicles.Car;
import q2.com.company.vehicles.Lorry;
import q2.com.company.vehicles.SportCar;

public class Main {
    public static void main(String[] args) {
        Driver driver1 = new Driver(35,"Borisevich Vlad Antonovich", 15);
        Driver driver2 = new Driver(28, "Buklis Konstantin Leonidovich", 4);

        Engine engine1 = new Engine("Audi", 200 );
        Engine engine2 = new Engine("Ferrari", 500 );
        Engine engine3 = new Engine("Volvo", 1000);

        Car car1 = new Car("Audi A4", "седан", 1500, driver1, engine1);
        Car car2 = new Car("Ferrari Enzo", "спорткар", 1000, driver2, engine2);

        Lorry lorry1 = new Lorry("Volvo VNL", "грузовик", 3000, driver1, engine3, 5000);

        SportCar sportCar1 = new SportCar("Ferrari F50", "спорткар", 1200, driver2, engine2, 350);

        car1.start();
        car2.turnLeft();
        lorry1.turnRight();
        sportCar1.stop();

        System.out.println(car1.toString());
        System.out.println(car2.toString());
        System.out.println(lorry1.toString());
        System.out.println(sportCar1.toString());
    }
}

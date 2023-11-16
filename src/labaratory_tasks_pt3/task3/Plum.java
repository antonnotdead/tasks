package labaratory_tasks_pt3.task3;
public class Plum extends Fruit{
    double pricePerKilogram = 4.3;
    @Override
    public void fruitCost(double weight) {
        System.out.println("Plums price: " + (weight * pricePerKilogram));
    }
}

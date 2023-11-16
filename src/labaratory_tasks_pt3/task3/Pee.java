package labaratory_tasks_pt3.task3;
public class Pee extends Fruit{
    double pricePerKilogram = 2.6;
    @Override
    public void fruitCost(double weight) {
        System.out.println("Pees price: " + (weight * pricePerKilogram));
    }
}

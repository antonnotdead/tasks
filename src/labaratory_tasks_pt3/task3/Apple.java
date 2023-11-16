package labaratory_tasks_pt3.task3;
public class Apple extends Fruit{
    double pricePerKilogram = 3.2;
    @Override
    public void fruitCost(double weight) {
        System.out.println("Apples price: " + (weight * pricePerKilogram));
    }
}

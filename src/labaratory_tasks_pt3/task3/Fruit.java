package labaratory_tasks_pt3.task3;
public abstract  class Fruit {
    double weight;
    public void printManufacturerInfo(){
        System.out.print("Made in RB");
    }
    abstract public void fruitCost(double weight);
}

package practical_tasks_pt3.task1_8;

public abstract class Animal {
    private int weight;
    private int age;
    private String name;
    public Animal(){
        this.age = 0;
        this.weight = 0;
        this.name = "Animal";
    }

    public Animal(int age, int weight, String name){
        this.age = age;
        this.weight = weight;
        this.name = name;
    }
    public Animal(Animal ob){
        this.age = ob.age;
        this.weight = ob.weight;
        this.name = ob.name;
    }
    public abstract void voice();
    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getWeight() {
        return weight;
    }
    public void show(){
        System.out.println(this);
    }
}

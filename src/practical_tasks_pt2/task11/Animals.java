package practical_tasks_pt2.task11;

public class Animals {
    public String name;
    public int age;
    public int weight;
    public int height;
    final int AGE = 5;
    final int WEIGHT = 2;
    final int HEIGHT = 20;

    public Animals(){
        name = "Kesha";
        age = 1;
        weight = 2;
        height = 10;
    }
    public Animals(String name, int age, int weight, int height){
        this.age = age;
        this.name = name;
        this.weight = weight;
        this.height = height;
    }

    public void show() {
        System.out.println("Animals: " +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", height=" + height +
                ", AGE=" + AGE +
                ", WEIGHT=" + WEIGHT +
                ", HEIGHT=" + HEIGHT +
                '}');
    }
}

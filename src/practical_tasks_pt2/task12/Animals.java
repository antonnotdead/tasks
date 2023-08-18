package practical_tasks_pt2.task12;

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
    public static boolean isnamesame(Animals obj1, Animals obj2){
        return (obj1.name == obj2.name);
    }

    public void statscomporatinon (){
        if (this.age > AGE){
            System.out.print("over " + AGE + "y.o");
        } else if (this.age < AGE) {
            System.out.print("under " + AGE + "y.o");
        } else {
            System.out.print("age is " + AGE);
        }
        if (this.weight > WEIGHT){
            System.out.print("heavier than " + WEIGHT + "kg");
        } else if (this.weight < WEIGHT) {
            System.out.print("lighter than " + WEIGHT + "kg");
        } else {
            System.out.print("age is " + WEIGHT + "kg");
        }
        if (this.height > HEIGHT){
            System.out.print("over " + HEIGHT + "kg");
        } else if (this.height < HEIGHT) {
            System.out.print("under " + HEIGHT + "kg");
        } else {
            System.out.print("age is " + HEIGHT + "kg");
        }
    }
}

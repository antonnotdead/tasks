package practical_tasks_pt2.task12;

import java.util.Objects;

public class Animal {
    public String name;
    public int age;
    public int weight;
    public int height;
    final int AGE = 5;
    final int WEIGHT = 2;
    final int HEIGHT = 20;

    public Animal(){
        name = "Kesha";
        age = 1;
        weight = 2;
        height = 10;
    }
    public Animal(String name, int age, int weight, int height){
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
                ", height=" + height);
    }
    public static boolean isnamesame(Animal obj1, Animal obj2){
        return (Objects.equals(obj1.name, obj2.name));
    }

    public void statscomporatinon (){
        if (this.age > AGE){
            System.out.print("over " + AGE + " y.o; ");
        } else if (this.age < AGE) {
            System.out.print("under " + AGE + " y.o; ");
        } else {
            System.out.print("age is " + AGE);
        }
        if (this.weight > WEIGHT){
            System.out.print("heavier than " + WEIGHT + " kg; ");
        } else if (this.weight < WEIGHT) {
            System.out.print("lighter than " + WEIGHT + " kg; ");
        } else {
            System.out.print("age is " + WEIGHT + " kg; ");
        }
        if (this.height > HEIGHT){
            System.out.print("above " + HEIGHT + " cm.");
        } else if (this.height < HEIGHT) {
            System.out.print("below " + HEIGHT + " cm.");
        } else {
            System.out.println("heigh is " + HEIGHT + " cm.");
        }
    }

    public static void main(String[] args){
        Animal dog = new Animal("Kesha", 4, 2, 20), cat = new Animal();
        dog.show();
        cat.show();
        if (Animal.isnamesame(dog, cat)){
            dog.statscomporatinon();
        }
        else {
            cat.statscomporatinon();
        }
    }
}

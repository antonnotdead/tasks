package practical_tasks_pt2.task14;

public class People {
    private String name;
    private int age;
    private int weight;
    private int height;

    public People(String info){
        String[] characteristics = info.split(";");
        name = characteristics[0];
        age = Integer.parseInt(characteristics[1]);
        weight = Integer.parseInt(characteristics[2]);
        height = Integer.parseInt(characteristics[3]);
    }
    public void Compare(String info){
        String[] characteristics = info.split(";");
        String name = characteristics[0];
        int age = Integer.parseInt(characteristics[1]);
        int weight = Integer.parseInt(characteristics[2]);
        int height = Integer.parseInt(characteristics[3]);
        if (this.age > age){
            System.out.println(this.name + " is older than " + name);
        } else if (this.age < age) {
            System.out.println(name + " is older than " + this.name);
        } else{
            System.out.println(name + this.name + " have the same age");
        }
        if (this.weight > weight){
            System.out.println(this.weight + " is weighs more than " + weight);
        } else if (this.weight < weight) {
            System.out.println(weight + " is weighs more than " + this.weight);
        } else{
            System.out.println(weight + this.weight + " have the same weight");
        }
        if (this.height > height){
            System.out.println(this.height + " is taller than " + height);
        } else if (this.height < height) {
            System.out.println(height + " is taller than " + this.height);
        } else{
            System.out.println(height + this.height + " have the same height");
        }
    }
    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", height=" + height +
                '}';
    }
}

package practical_tasks_pt3.task1_8;

public class Dog extends Animal{
    public int bones;
    public Dog(){
        super();
        this.bones = 0;
    }
    public Dog(int age, int weight, String name, int bones){
        super(age, weight, name);
        this.bones = bones;
    }
    public Dog(Dog ob){
        super(ob);
        this.bones = ob.bones;
    }
    @Override
    public void voice() {
        System.out.println("Woof");
    }
}

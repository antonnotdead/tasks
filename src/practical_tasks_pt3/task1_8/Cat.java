package practical_tasks_pt3.task1_8;

public class Cat extends Animal{
    private int mice;
    public Cat(){
        super();
        this.mice = 0;
    }
    public Cat(int age, int weight, String name, int mice){
        super(age, weight, name);
        this.mice = mice;
    }
    public Cat(Cat ob){
        super(ob);
        this.mice = ob.mice;
    }

    @Override
    public void voice() {
        System.out.println("Meow");
    }

    public void setMice(int mice) {
        this.mice = mice;
    }

    public int getMice() {
        return mice;
    }
    public void show(){
        System.out.println(this);
    }
}

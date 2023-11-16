package practical_tasks_pt3.task11;

public class Main {
    public static void main(String[] args) {
        Cookable ck = new Cookable() {
            public void cook(String str) {
                System.out.println("fry " + str);
            }
        };

    Food food = new Food();
    food.prepare(ck, "potato");
    }
}
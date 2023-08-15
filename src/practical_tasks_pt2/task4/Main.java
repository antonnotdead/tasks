package practical_tasks_pt2.task4;

public class Main {
    public static void main(String[] args){
        Student ivanov = new Student();
        ivanov.nameStudent = "Petya";
        ivanov.numberCourse = 2;
        ivanov.scores = new double[]{7, 12.4, 5.0, 2.3};
        System.out.println(ivanov.calculate_avg());
    }
}

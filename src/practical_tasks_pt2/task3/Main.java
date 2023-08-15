package practical_tasks_pt2.task3;



public class Main {
    public static void main(String[] args){
        Student ivanov = new Student();
        ivanov.nameStudent = "Petya";
        ivanov.numberCourse = 2;
        Student petrov = ivanov;
        petrov.show();
        ivanov.show();
    }
}

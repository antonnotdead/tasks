package practical_tasks_pt2.task1;

public class Main {
    public static void main(String[] args){
        Student ivanov = new Student();
        ivanov.nameStudent = "Petya";
        ivanov.numberCourse = 2;
        Student petrov = new Student();
        petrov.nameStudent = "Ivan";
        petrov.numberCourse = 3;
        System.out.println(ivanov);
        System.out.println(petrov);
    }
}

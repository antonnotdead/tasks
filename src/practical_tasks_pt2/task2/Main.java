package practical_tasks_pt2.task2;

import practical_tasks_pt2.task1.Student;

public class Main {
    public static void main(String[] args){
        Student ivanov = new Student();
        ivanov.nameStudent = "Petya";
        ivanov.numberCourse = 2;
        Student petrov = ivanov;
        System.out.println(ivanov);
        System.out.println(petrov);
    }
}

package practical_tasks_pt4.task4;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        Map<String, Integer> grades = new HashMap<>();
        grades.put("Math", 5);
        grades.put("Physics", 4);
        students.add(new Student("Vlad Borisevich", "Group A", 2, grades));
        grades = new HashMap<>();
        grades.put("Math", 4);
        grades.put("Physics", 3);
        students.add(new Student("Konstantin Buklis", "Group B", 2, grades));
        grades = new HashMap<>();
        grades.put("Math", 3);
        grades.put("Physics", 2);
        students.add(new Student("Anton Gavrilik", "Group A", 3, grades));

        Student.processStudents(students);

        System.out.println("Students on course 3:");
        Student.printStudents(students, 3);
    }
}
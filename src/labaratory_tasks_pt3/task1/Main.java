package labaratory_tasks_pt3.task1;
public class Main {
    public static void main(String[] args) {
        Student[] students = new Student[]{
                new Student("Vlad", "Borisevich", "Group 160801", 8),
                new Magistracy("Konstantin", "Buklis", "Group 160801", 8.5, "Scientific work 1"),
                new Magistracy("Anton", "Gavrilik", "Group 160801", 8, "Scientific work 2"),
                new Student("Zhenya", "Goroh", "Group 160801", 7.5),
                new Magistracy("Daniil", "Volk", "Group 160801", 8.5, "Scientific work 3")
        };

        for (Student student : students) {
            System.out.println("Scholarship for " + student.getFirstName() + " " + student.getLastName() + ": " + student.getScholarship() + " BYN");
        }
    }
}







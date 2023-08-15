package practical_tasks_pt2.task8;


public class Main {
    public static void main(String[] args){
        Student ivanov = new Student(3 , "Petya");
        double[] score = new double[]{7, 12.4, 5.0, 2.3};
        System.out.println(Student.calculate_avg(score));
    }
}

package practical_tasks_pt2.task5;

public class Student {
    public int numberCourse;
    public String nameStudent;
    public double[] scores;
    public String show() {
        return "numberCourse=" + numberCourse +
                ", nameStudent='" + nameStudent;
    }
    public static double calculate_avg(double[] score){
        double sum = 0;
        for (int i = 0; i < score.length; i++){
            sum += score[i];
        }
        return sum/score.length;
    }
}

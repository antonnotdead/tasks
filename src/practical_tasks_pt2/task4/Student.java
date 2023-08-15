package practical_tasks_pt2.task4;

public class Student {
    public int numberCourse;
    public String nameStudent;
    public double[] scores;
    public String show() {
        return "numberCourse=" + numberCourse +
                ", nameStudent='" + nameStudent;
    }
    public double calculate_avg(){
        double sum = 0;
        for (int i = 0; i < scores.length; i++){
            sum += scores[i];
        }
        return sum/scores.length;
    }
}

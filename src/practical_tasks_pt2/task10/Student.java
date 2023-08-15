package practical_tasks_pt2.task10;

import java.util.Arrays;

public class Student {
    public int numberCourse;
    public String nameStudent;
    public double[] scores;
    public Student(){
        numberCourse = 1;
        nameStudent = "noname";
    }
    public Student(int numberCourse, String nameStudent){
        this.nameStudent = nameStudent;
        this.numberCourse = numberCourse;

    }

    public Student(Student obj){
        this.nameStudent = obj.nameStudent;
        this.numberCourse = obj.numberCourse;
    }
    public String show() {
        return "numberCourse=" + numberCourse +
                ", nameStudent='" + nameStudent;
    }
    public static double calculate_avg(double[] score){
        double sum = Arrays.stream(score).sum();
        return sum/score.length;
    }
}

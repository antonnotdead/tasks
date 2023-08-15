package practical_tasks_pt2.task7;

import java.util.Arrays;

public class Student {
    public int numberCourse;
    public String nameStudent;
    public double[] scores;
    public Student(){
        numberCourse = 1;
        nameStudent = "noname";
    }
    public Student(int Course, String name){
        nameStudent = name;
        numberCourse = Course;
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

package labaratory_tasks_pt4.task1;

import java.util.LinkedList;

public class Student implements Comparable<Student>  {
    private String name;
    private int course;

    public String getName() {
        return name;
    }

    public int getCourse() {
        return course;
    }
    public Student(){
        this.course = 0;
        this.name = "Vasya Pupkin";
    }

    public Student(String name, int course){
        this.name = name;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }

    public static void printStudents(LinkedList<Student> students, int course){
        Student tempStudent;
        for (Student student : students) {
            tempStudent = student;
            if (tempStudent.getCourse() == course) {
                System.out.println(tempStudent);
            }
        }
        System.out.println("\n");
    }
    public static void printStudents(LinkedList<Student>students){
        for (Student student: students){
            System.out.println(student);
        }
        System.out.println("\n");
    }
    public static LinkedList<Student> union(LinkedList<Student> set1, LinkedList<Student> set2){
        set1.addAll(set2);
        set1.sort(new StudentComparator());
        return set1;
    }
    public static LinkedList<Student> intersect(LinkedList<Student> set1, LinkedList<Student> set2){
        set1.retainAll(set2);
        set2.sort(new StudentComparator());
        return set2;
    }
    @Override
    public int compareTo(Student anotherStudent) {
        int anotherStudentCourse = anotherStudent.getCourse();
        return this.course - anotherStudentCourse;
    }
}

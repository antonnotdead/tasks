package labaratory_tasks_pt4.task1;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args){
        LinkedList<Student> BsuirStudents_1 = new LinkedList();
        BsuirStudents_1.add(new Student("Обэмэ", 1));
        BsuirStudents_1.add(new Student("Николай Красноглазый", 4));
        BsuirStudents_1.add(new Student("Саня ФрамеТамер", 2));
        BsuirStudents_1.add(new Student("Антон Кучерявый", 2));
        BsuirStudents_1.add(new Student());
        BsuirStudents_1.add(new Student("Ботан Буклиз", 2));
        Student.printStudents(BsuirStudents_1);


        LinkedList<Student> BsuirStudents_2 = new LinkedList();
        BsuirStudents_2.add(new Student("Обэмэ", 1));
        BsuirStudents_2.add(new Student("Николай Красноглазый", 4));
        BsuirStudents_2.add(new Student("Илюха Ексиль", 2));
        BsuirStudents_2.add(new Student("Антон Кучерявый", 2));
        BsuirStudents_2.add(new Student("Влад Черный", 4));
        BsuirStudents_2.add(new Student("Ботан Буклиз", 2));
        Student.printStudents(BsuirStudents_2);

        LinkedList<Student> BsuirStudents_union = Student.union(BsuirStudents_1, BsuirStudents_2);
        Student.printStudents(BsuirStudents_union);

        LinkedList<Student> BsuirStudents_intersect = Student.intersect(BsuirStudents_1, BsuirStudents_2);
        Student.printStudents(BsuirStudents_intersect);
    }
}

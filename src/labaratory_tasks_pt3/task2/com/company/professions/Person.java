package labaratory_tasks_pt3.task2.com.company.professions;

public class Person{
    int age;
    String fullName;
    public Person(int age, String fullName){
        this.age = age;
        this.fullName = fullName;
    }

    @Override
    public String toString(){
        return "Information about person:\nPerson full name: " + fullName + "\nPerson's age: " + age;
    }
}

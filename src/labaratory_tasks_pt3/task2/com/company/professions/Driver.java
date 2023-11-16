package labaratory_tasks_pt3.task2.com.company.professions;

public class Driver extends Person{
    int drivingExperience;

    public Driver(int age, String fullName, int drivingExperience) {
        super(age, fullName);
        this.drivingExperience = drivingExperience;
    }

    @Override
    public String toString(){
        return "Information about driver:\nDriver full name: " + fullName + "\nPerson's age: " + age +
                "\nDriver's driving experience: " + drivingExperience;
    }
}

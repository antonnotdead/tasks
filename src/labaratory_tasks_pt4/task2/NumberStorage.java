package labaratory_tasks_pt4.task2;

import java.util.TreeSet;

public class NumberStorage {
    private TreeSet<Double> numbers;

    public NumberStorage(){
        numbers = new TreeSet<>();
    }

    public void showStorage(){
        for (Double number : numbers){
            System.out.println(number);
        }
        System.out.println("\n");
    }

    public void addNumber(double number){
        numbers.add(number);
    }

    public void removeNumber(double number){
        numbers.remove(number);
    }

    public double findClosest(double target){
        if (numbers.isEmpty()){
            throw new IllegalStateException("The storage is empty, could`t find the closest one");
        }
        Double closest_up = numbers.ceiling(target);
        Double closest_down = numbers.floor(target);
        if(closest_up == null){
            if(closest_down == null){
                throw new IllegalStateException("Could`t find the closest one");
            }
            else{
                return closest_down;
            }
        } else if (closest_down == null) {
            if(closest_up == null){
                throw new IllegalStateException("Could`t find the closest one");
            }
            else{
                return closest_up;
            }
        }
        double diff_up = closest_up - target;
        double diff_down = target - closest_down;
        if (diff_up > diff_down){
            return closest_down;
        } else if (diff_up < diff_down) {
            return closest_up;
        }else {
            return closest_up;
        }
    }
    public static void main(String[] args){
        NumberStorage storage1 = new NumberStorage();
        storage1.addNumber(7.545);
        storage1.addNumber(6);
        storage1.addNumber(-2.1);
        storage1.addNumber(312);
        storage1.addNumber(8.1);
        storage1.addNumber(0);
        storage1.addNumber(0.123213);
        storage1.addNumber(-1000);

        storage1.showStorage();

        storage1.removeNumber(-1000.0);
        storage1.removeNumber(0);

        storage1.showStorage();

        System.out.println(storage1.findClosest(6.85));
    }
}

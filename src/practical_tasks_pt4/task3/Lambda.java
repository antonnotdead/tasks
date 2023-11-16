package practical_tasks_pt4.task3;

import java.util.function.Function;

public class Lambda {
    public static void main(String[] args) {
        Function<Integer, String> numberType = n -> {
            return n > 0 ? "Положительное" : n < 0 ? "Отрицательное" : "Ноль";
        };
        System.out.println(numberType.apply(0));
    }

}
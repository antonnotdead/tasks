package practical_tasks_pt4.task1;

public class Main {
    public static void main(String[] args) {
        Integer[] intArray = { 1, 2, 3 };
        Double[] doubleArray = { 0.1, 1.8, 3.1 };

        NumberArray<Integer, Double> numberArray = new NumberArray<>(intArray, doubleArray);

        // Вычисляем сумму двух чисел разных типов
        System.out.println(numberArray.sum(1, 2.));
        System.out.println(numberArray.compare());
        System.out.println(numberArray.max());
        System.out.println(numberArray.min());
    }
}

package practical_tasks_pt4.task1;

import java.util.ArrayList;

public class NumberArray<T extends Number, U extends Number> {
    private T[] arr1;
    private U[] arr2;

    public NumberArray(T[] arr1, U[] arr2) {
        this.arr1 = arr1;
        this.arr2 = arr2;
    }

    public Number sum(T num1, U num2) {
        double res = num1.doubleValue() + num2.doubleValue();
        if (num1 instanceof Integer && num2 instanceof Integer) {
            return Integer.valueOf((int) res);
        } else {
            return Double.valueOf(res);
        }
    }

    public ArrayList<Boolean> compare() {
        ArrayList<Boolean> res = new ArrayList<>();
        if (arr1.length != arr2.length) {
            res.add(false);
            return res;
        } else {
            for (int i = 0; i < arr1.length; i++) {
                if (arr1[i].doubleValue() > arr2[i].doubleValue()) {
                    res.add(true);
                } else {
                    res.add(false);
                }
            }
        }
        return res;
    }

    public Number max() {
        T max1 = arr1[0];
        U max2 = arr2[0];
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i].doubleValue() > max1.doubleValue()) {
                max1 = arr1[i];
            }
        }
        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i].doubleValue() > max2.doubleValue()) {
                max2 = arr2[i];
            }
        }
        if (max1.doubleValue() > max2.doubleValue()) {
            return max1;
        } else {
            return max2;
        }
    }

    public Number min() {
        T min1 = arr1[0];
        U min2 = arr2[0];
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i].doubleValue() < min1.doubleValue()) {
                min1 = arr1[i];
            }
        }
        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i].doubleValue() < min2.doubleValue()) {
                min2 = arr2[i];
            }
        }
        if (min1.doubleValue() < min2.doubleValue()) {
            return min1;
        } else {
            return min2;
        }
    }
}
package labaratory_tasks_pt2.task5;

public class Main {
    public static void main(String[] args) {
        Double double1 = Double.valueOf("3.14234523452345");
        Double double2 = Double.valueOf(3.14);
        double double3 = Double.parseDouble("11");

        System.out.println("Byte - " + double1.byteValue());
        System.out.println("Int - " + double1.intValue());
        System.out.println("Short - " + double1.shortValue());
        System.out.println("Long - " + double1.longValue());
        System.out.println("Float - " + double1.floatValue());

        String double4 = Double.toString(3.14);

        System.out.println(double4);
        System.out.println(double3);
    }
}
package practical_tasks_pt2.task13;

public class VarArgs {
    public static void main(String[] args){
        VarArgs.showAll(2, 4, 454, -100);
        System.out.println(VarArgs.summation(2, 4, 454, -100));
        System.out.println(VarArgs.multiplication(2, 4, 454, -100));
        VarArgs.sorted(2, 4, 454, -100, 22, 5);
    }
    public static void showAll(int ... param){
        for (int p : param){
            System.out.print(p + " ");
        }
        System.out.println();
    }
    public static int summation(int ... num){
        int sum = 0;
        for (int n : num) sum += n;
        return sum;
    }
    public static int multiplication(int ... num){
        int mult = 1;
        for (int n: num) mult *= n;
        return mult;
    }
    public static void sorted (int ... num){
        int[] mas = new int[num.length];
        int temp;
        System.arraycopy(num, 0, mas, 0, num.length);
        for (int i = 0; i < num.length-1; i++){
            if (mas[i] > mas[i+1]){
                temp = mas[i+1];
                mas[i+1] = mas[i];
                mas[i] = temp;
            }
        }
        for (int ma : mas) {
            System.out.print(ma + " ");
        }
        System.out.println();
    }
}

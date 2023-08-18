package practical_tasks_pt2.task12;

public class Mat {
    int value;

    public void create(){
        value = (int)(Math.random()*100);
    }

    public static Mat[] createMat(int n) {
        Mat mas[] = new Mat[n];
        for(int i = 0; i < n; i++) {
            mas[i] = new Mat();
            mas[i].create();
        }
        return mas;
    }

    public static Mat[][] createMat(int n, int m) {
        Mat mas2[][] = new Mat[n][m];
        for(int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                mas2[i][j] = new Mat();
                mas2[i][j].create();
            }
        }
        return mas2;
    }

    public static void show(Mat[] mas){
        for(int i = 0; i < 5; i++) {
            System.out.print(mas[i].value + " ");
        }
        System.out.print("\n------------");
    }
    public static void show2(Mat[][] mas2){
        for(int i = 0; i < 5; i++) {
            System.out.println();
            for (int j = 0; j < 5; j++) {
                System.out.print(mas2[i][j].value + " ");
            }
        }
        System.out.print("\n------------");
        System.out.println();
    }

    public static void sum(Mat[][] mas2, Mat[][] mas3) {
        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < 5; j++) {
                int val = mas2[i][j].value + mas3[i][j].value;
                System.out.print(val + " ");
            }
            System.out.println();
        }
        System.out.print("\n------------");
        System.out.println();
    }

    public static void diff(Mat[][] mas2, Mat[][] mas3) {
        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < 5; j++) {
                int val = mas2[i][j].value - mas3[i][j].value;
                System.out.print(val + " ");
            }
            System.out.println();
        }
        System.out.print("\n------------");
        System.out.println();
    }

    public static void mult(Mat[][] mas2, Mat[][] mas3) {
        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < 5; j++) {
                int val = mas2[i][j].value * mas3[i][j].value;
                System.out.print(val + " ");
            }
            System.out.println();
        }
        System.out.print("\n------------");
        System.out.println();
    }
    public static void main(String[] args) {
        Mat mass[] = Mat.createMat(5);
        Mat mass2[][] = Mat.createMat(5,5);
        Mat mass3[][] = Mat.createMat(5,5);
        //Mat massres[][] = Mat.createMat(5,5);
        Mat.show(mass);
        Mat.show2(mass2);
        Mat.show2(mass3);
        Mat.sum(mass2, mass3);
        Mat.diff(mass2, mass3);
        Mat.mult(mass2, mass3);
        //Mat.show2(massres);
    }
}

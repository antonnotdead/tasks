package labaratory_tasks_pt2.task4;

public class Fraction {
    private int m;
    private int n;

    public Fraction(){
        this.m = 0;
        this.n = 1;
    }
    public Fraction(int m, int n){
        this.m = m;
        this.n = n;
    }
    public Fraction(Fraction fraction){
        this.m = fraction.m;
        this.n = fraction.n;
    }
    public static void sum(Fraction f1, Fraction f2){
        int m = f1.m * f2.n + f2.m * f1.n;
        int n = f1.n * f2.n;
        Fraction fr = new Fraction(m, n);
        fr.reduceFraction();
        System.out.println(fr.m + "/" + fr.n);

    }
    public static void subtraction(Fraction f1, Fraction f2){
        int m = f1.m * f2.n - f2.m * f1.n;
        int n = f1.n * f2.n;
        Fraction fr = new Fraction(m, n);
        fr.reduceFraction();
        System.out.println(fr.m + "/" + fr.n);

    }
    public static void multiplication(Fraction f1, Fraction f2){
        int m = f1.m * f2.m;
        int n = f1.n * f2.n;
        Fraction fr = new Fraction(m, n);
        fr.reduceFraction();
        System.out.println(fr.m + "/" + fr.n);
    }
    public static void division(Fraction f1, Fraction f2){
        int m = f1.m * f2.n;
        int n = f1.n * f2.m;
        Fraction fr = new Fraction(m, n);
        fr.reduceFraction();
        System.out.println(fr.m + "/" + fr.n);
    }
    public void reduceFraction(){
        int p = this.n;
        for (int i = p; i > 0; i--) {
            if(((this.n % i) == 0) && ((this.m % i) == 0)){
                this.n /= i;
                this.m /= i;
            }
        }
    }
    public static Fraction[] massEdit(Fraction[] frMass){
        int i_add = (frMass.length % 2)*2;
        for (int i = 0; i < frMass.length - i_add; i++) {
            if (i % 2 == 0){
                frMass[i].m = frMass[i].m*frMass[i+1].n + frMass[i+1].m*frMass[i].n;
                frMass[i].n = frMass[i].n * frMass[i+1].n;
                frMass[i].reduceFraction();
            }
        }
        return frMass;
    }
    public static void main(String[] args){
        Fraction fr1 = new Fraction(1,3);
        Fraction fr2 = new Fraction(2, 6);
        Fraction.sum(fr1, fr2);
        Fraction.subtraction(fr1, fr2);
        Fraction.multiplication(fr1,fr2);
        Fraction.division(fr1, fr2);
    }
}

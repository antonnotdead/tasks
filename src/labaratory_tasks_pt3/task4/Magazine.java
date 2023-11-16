package labaratory_tasks_pt3.task4;

public class Magazine implements Printable{
    private String title;
    public Magazine(String title){
        this.title = title;
    }
    public void print(){
        System.out.println(this.title);
    }
    public static void printMagazines(Printable[] printables){
        for (Printable p:printables){
            if (p instanceof Magazine){
                p.print();
            }
        }
    }
}

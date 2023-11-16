package labaratory_tasks_pt3.task4;

public class Book implements Printable{
    private String title;
    public Book(String title){
        this.title = title;
    }
    public void print(){
        System.out.println(this.title);
    }
    public static void printBook(Printable[] printables){
        for (Printable p:printables){
            if (p instanceof Book){
                p.print();
            }
        }
    }
}

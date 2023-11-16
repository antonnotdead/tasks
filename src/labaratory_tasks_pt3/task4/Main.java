package labaratory_tasks_pt3.task4;
public class Main {
    public void main(String[] args){
        Printable[] printables = new Printable[5];
        printables[0] = new Book("1984");
        printables[1] = new Magazine("Vogue");
        printables[2] = new Magazine("Forbes");
        printables[3] = new Book("Deja Vu. Bohemian Rap, Soda and Me ");
        printables[4] = new Book("The Mamba Mentality");
        for (Printable printable : printables) {
            printable.print();
        }
        Magazine.printMagazines(printables);
        Book.printBook(printables);
    }
}

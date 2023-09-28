package labaratory_tasks_pt2.task3;

import java.util.Scanner;
import java.util.TreeSet;

public class Book {
    private  String author;
    private String bookName;
    private String publishingYear;
    private int pages;

    public Book(){
        this.author = null;
        this.bookName = null;
        this.publishingYear = null;
        this.pages = 0;
    }
    public Book(String author, String bookName, String publishingYear, int pages){
        this.author = author;
        this.bookName = bookName;
        this.publishingYear = publishingYear;
        this.pages = pages;
    }
    public void setBookName(String bookName) {
        this.bookName = bookName;
    }
    public void setBookName() {
        Scanner sc = new Scanner(System.in);
        this.bookName = sc.nextLine();
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public void setAuthor() {
        Scanner sc = new Scanner(System.in);
        this.author = sc.nextLine();
    }
    public void setPages(int pages) {
        this.pages = pages;
    }

    public void setPages() {
        Scanner sc = new Scanner(System.in);
        this.pages = sc.nextInt();
    }
    public void setPublishingYear(String publishingYear) {
        this.publishingYear = publishingYear;
    }
    public void setPublishingYear() {
        Scanner sc = new Scanner(System.in);
        this.publishingYear = sc.nextLine();
    }

    public void getFullBookInfo(String bookName,Book ... books) {
        for (Book book : books) {
            if (book.bookName.equals(bookName)){
                System.out.println(book);
            }
        }
    }
}

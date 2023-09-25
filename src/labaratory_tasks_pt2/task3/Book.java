package labaratory_tasks_pt2.task3;

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
    public void setAuthor(String author) {
        this.author = author;
    }
    public void setPages(int pages) {
        this.pages = pages;
    }
    public void setPublishingYear(String publishingYear) {
        this.publishingYear = publishingYear;
    }
}

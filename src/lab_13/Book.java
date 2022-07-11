package lab_13;

public class Book {
    private String nameBook;
    private int idBook;
    private String author;
    private int year;

    public Book() {
    }

    public Book(String nameBook, int idBook, String author, int year) {
        this.nameBook = nameBook;
        this.idBook = idBook;
        this.author = author;
        this.year = year;
    }

    public String getNameBook() {
        return nameBook;
    }

    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }

    public int getIdBook() {
        return idBook;
    }

    public void setIdBook(int idBook) {
        this.idBook = idBook;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }


    @Override
    public String toString() {
        return nameBook + ";" + idBook + ";" + author + ";" + year;
    }


    public void toString(int index, String nameBook, int idBook, String author, int year) {
        System.out.printf("Book %02d: %s \n\tISBN: %d \n\tAuthor: %s\n\tYear: %d\n\n",index, nameBook , idBook , author , year);
    }

}

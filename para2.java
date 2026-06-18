class Book {
    String title;
    String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
}

public class BookMain {
    static void displayBook(Book b) {
        System.out.println("Title: " + b.title + ", Author: " + b.author);
    }

    public static void main(String[] args) {
        Book b1 = new Book("Java Programming", "James Gosling");
        displayBook(b1);
    }
}


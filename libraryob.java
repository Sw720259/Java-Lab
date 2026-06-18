class Book {
    String title;
    String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
}

class Library {
    static Book modifyBook(Book b) {
        b.author = "Updated Author";
        return b;
    }
}

public class LibraryMain {
    public static void main(String[] args) {
        Book b1 = new Book("Java Basics", "James");
        System.out.println("Before: " + b1.title + " - " + b1.author);
        Book updated = Library.modifyBook(b1);
        System.out.println("After: " + updated.title + " - " + updated.author);
    }
}


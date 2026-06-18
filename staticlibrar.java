
class Library {

    // Static nested class
    static class Book {
        private int bookId;
        private String title;
        private String author;

        // Constructor
        Book(int bookId, String title, String author) {
            this.bookId = bookId;
            this.title = title;
            this.author = author;
        }

        // Method to display book details
        void display() {
            System.out.println("Book ID: " + bookId);
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
            System.out.println("---------------------------");
        }
    }

    public static void main(String[] args) {
        // Create Book objects using the static nested class
        Book b1 = new Book(101, "The Great Gatsby", "F. Scott Fitzgerald");
        Book b2 = new Book(102, "1984", "George Orwell");
        Book b3 = new Book(103, "To Kill a Mockingbird", "Harper Lee");

        // Display book information
        b1.display();
        b2.display();
        b3.display();
    }
}


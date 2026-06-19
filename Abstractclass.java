// Abstract class
abstract class LibraryItem {
    int itemId;
    String title;
    boolean isIssued;

    // Constructor
    LibraryItem(int itemId, String title) {
        this.itemId = itemId;
        this.title = title;
        this.isIssued = false;
    }

    // Abstract methods
    abstract void issue();
    abstract void returnItem();

    // Display details
    void display() {
        System.out.println("ID: " + itemId + ", Title: " + title + ", Issued: " + isIssued);
    }
}

// Book class
class Book extends LibraryItem {
    Book(int itemId, String title) {
        super(itemId, title);
    }

    @Override
    void issue() {
        if (!isIssued) {
            isIssued = true;
            System.out.println("Book '" + title + "' issued successfully.");
        } else {
            System.out.println("Book '" + title + "' is already issued.");
        }
    }

    @Override
    void returnItem() {
        if (isIssued) {
            isIssued = false;
            System.out.println("Book '" + title + "' returned successfully.");
        } else {
            System.out.println("Book '" + title + "' was not issued.");
        }
    }
}

// Magazine class
class Magazine extends LibraryItem {
    Magazine(int itemId, String title) {
        super(itemId, title);
    }

    @Override
    void issue() {
        if (!isIssued) {
            isIssued = true;
            System.out.println("Magazine '" + title + "' issued successfully.");
        } else {
            System.out.println("Magazine '" + title + "' is already issued.");
        }
    }

    @Override
    void returnItem() {
        if (isIssued) {
            isIssued = false;
            System.out.println("Magazine '" + title + "' returned successfully.");
        } else {
            System.out.println("Magazine '" + title + "' was not issued.");
        }
    }
}

// Main class
public class LibraryMain {
    public static void main(String[] args) {
        Book b1 = new Book(101, "Java Programming");
        Magazine m1 = new Magazine(201, "Tech Monthly");

        b1.display();
        b1.issue();
        b1.returnItem();

        m1.display();
        m1.issue();
        m1.returnItem();
    }
}


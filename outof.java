class OutOfStockException extends Exception {
    OutOfStockException(String msg) { super(msg); }
}

public class Stock {
    public static void main(String[] args) {
        int available = 10, requested = 15;
        try {
            if (requested > available) throw new OutOfStockException("Stock not available!");
            System.out.println("Order placed.");
        } catch (OutOfStockException e) {
            System.out.println(e.getMessage());
        }
    }
}


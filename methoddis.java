class Display {
    void display(String str) {
        System.out.println("String: " + str);
    }

    void display(int num) {
        System.out.println("Integer: " + num);
    }
}

public class DisplayMain {
    public static void main(String[] args) {
        Display d = new Display();
        d.display("Hello Java");
        d.display(100);
    }
}


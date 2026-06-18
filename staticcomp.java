class Computer {

    // Static nested class
    static class Specification {
        private String processor;
        private int ramGB;
        private int storageGB;
        private String graphicsCard;

        // Constructor
        Specification(String processor, int ramGB, int storageGB, String graphicsCard) {
            this.processor = processor;
            this.ramGB = ramGB;
            this.storageGB = storageGB;
            this.graphicsCard = graphicsCard;
        }

        // Method to display hardware configuration
        void display() {
            System.out.println("Processor: " + processor);
            System.out.println("RAM: " + ramGB + " GB");
            System.out.println("Storage: " + storageGB + " GB");
            System.out.println("Graphics Card: " + graphicsCard);
            System.out.println("---------------------------");
        }
    }

    public static void main(String[] args) {
        // Create Specification objects using the static nested class
        Specification s1 = new Specification("Intel Core i7", 16, 512, "NVIDIA GTX 1660");
        Specification s2 = new Specification("AMD Ryzen 5", 8, 256, "AMD Radeon RX 5600");
        Specification s3 = new Specification("Apple M1", 16, 1024, "Integrated GPU");

        // Display hardware configurations
        s1.display();
        s2.display();
        s3.display();
    }
}


class Bank {
    double getInterestRate() {
        return 0.0;
    }
}

class SBI extends Bank {
    @Override
    double getInterestRate() {
        return 5.5;
    }
}

class HDFC extends Bank {
    @Override
    double getInterestRate() {
        return 6.0;
    }
}

class ICICI extends Bank {
    @Override
    double getInterestRate() {
        return 6.5;
    }
}

public class MainBank {
    public static void main(String[] args) {
        Bank b1 = new SBI();
        Bank b2 = new HDFC();
        Bank b3 = new ICICI();
        System.out.println("SBI Rate: " + b1.getInterestRate());
        System.out.println("HDFC Rate: " + b2.getInterestRate());
        System.out.println("ICICI Rate: " + b3.getInterestRate());
    }
}
`

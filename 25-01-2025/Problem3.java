public abstract class Payment {
    public abstract void processPayment(double amount);
}

class CreditCard extends Payment {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing credit card payment of $" + amount);
    }
}

class PayPal extends Payment {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing PayPal payment of $" + amount);
    }
}

public class Problem3 {
    public static void main(String[] args) {
        Payment myPayment1 = new CreditCard();
        myPayment1.processPayment(100.0);

        Payment myPayment2 = new PayPal();
        myPayment2.processPayment(150.0);
    }
}
public abstract class Account {
    protected String accountNumber;
    protected double balance;

    public Account(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);
    public abstract void displayAccountInfo();
}

class SavingsAccount extends Account {
    private double interestRate;

    public SavingsAccount(String accountNumber, double initialBalance, double interestRate) {
        super(accountNumber, initialBalance);
        this.interestRate = interestRate;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount + " to Savings Account");
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: " + amount + " from Savings Account");
        } else {
            System.out.println("Insufficient funds in Savings Account");
        }
    }

    @Override
    public void displayAccountInfo() {
        System.out.println("Savings Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
        System.out.println("Interest Rate: " + interestRate);
    }
}

class CheckingAccount extends Account {
    private double overdraftLimit;

    public CheckingAccount(String accountNumber, double initialBalance, double overdraftLimit) {
        super(accountNumber, initialBalance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount + " to Checking Account");
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= balance + overdraftLimit) {
            balance -= amount;
            System.out.println("Withdrew: " + amount + " from Checking Account");
        } else {
            System.out.println("Overdraft limit exceeded in Checking Account");
        }
    }

    @Override
    public void displayAccountInfo() {
        System.out.println("Checking Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
        System.out.println("Overdraft Limit: " + overdraftLimit);
    }
}

class Problem6 {
    public static void main(String[] args) {
        Account mySavings = new SavingsAccount("SA123", 1000.0, 0.05);
        mySavings.deposit(200);
        mySavings.withdraw(100);
        mySavings.displayAccountInfo();

        Account myChecking = new CheckingAccount("CA456", 500.0, 200.0);
        myChecking.deposit(150);
        myChecking.withdraw(700);
        myChecking.displayAccountInfo();
    }
}
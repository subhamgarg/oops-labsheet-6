// Question 8: Abstract BankAccount with SavingsAccount and CurrentAccount
abstract class BankAccount {
    protected double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);
}

class SavingsAccount extends BankAccount {
    public SavingsAccount(double balance) {
        super(balance);
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Savings Deposited: " + amount + ", Balance: " + balance);
    }

    @Override
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Savings Withdrawn: " + amount + ", Balance: " + balance);
        } else {
            System.out.println("Savings: Insufficient funds.");
        }
    }
}

class CurrentAccount extends BankAccount {
    private double overdraftLimit = 500;

    public CurrentAccount(double balance) {
        super(balance);
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Current Deposited: " + amount + ", Balance: " + balance);
    }

    @Override
    public void withdraw(double amount) {
        if (balance + overdraftLimit >= amount) {
            balance -= amount;
            System.out.println("Current Withdrawn: " + amount + ", Balance: " + balance);
        } else {
            System.out.println("Current: Overdraft limit exceeded.");
        }
    }
}

public class Question_08 {
    public static void main(String[] args) {
        BankAccount savings = new SavingsAccount(1000);
        BankAccount current = new CurrentAccount(200);

        savings.withdraw(500);
        current.withdraw(500); // Allowed due to overdraft
    }
}

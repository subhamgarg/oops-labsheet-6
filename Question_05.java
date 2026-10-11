// Question 5: BankAccount and SavingsAccount (Conditional Overriding)
class BankAccount {
    protected double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount + ". New Balance: " + balance);
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println("Withdrew: " + amount + ". New Balance: " + balance);
        } else {
            System.out.println("Insufficient funds or invalid amount.");
        }
    }
}

class SavingsAccount extends BankAccount {
    public SavingsAccount(double initialBalance) {
        super(initialBalance);
    }

    @Override
    public void withdraw(double amount) {
        if (balance - amount < 100) {
            System.out.println("Withdrawal denied! Balance cannot fall below 100.");
        } else {
            super.withdraw(amount);
        }
    }
}

public class Question_05 {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount(150);
        sa.deposit(50); // Balance becomes 200
        sa.withdraw(50); // Allowed, balance becomes 150
        sa.withdraw(60); // Denied, 150 - 60 = 90 (below 100)
    }
}

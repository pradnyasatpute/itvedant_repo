package ITV_assignments.core_java;

class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

class BankAccount {
    private double balance;
    
    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {

        balance += amount;
        System.out.println("Deposited: " + amount + ", New Balance: " + balance);
    }

    public void withdraw(double amount) throws InsufficientFundsException {
       
        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient funds. Balance: " + balance + ", Withdrawal Amount: " + amount);
        }
        balance -= amount;
        System.out.println("Withdrew: " + amount + ", New Balance: " + balance);
    }

    public double getBalance() {
        return balance;
    }
}

public class BankAppUsingThrow {
    public static void main(String[] args) {
        try {
            BankAccount account = new BankAccount(500.0);

            account.deposit(200.0);
            account.withdraw(100.0);
            account.withdraw(700.0); // This will throw exception
        } catch (InsufficientFundsException e) {
            System.out.println("Exception: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid operation: " + e.getMessage());
        }
    }
}


import java.util.Scanner;

class Account {
    private int accountNumber;
    private double balance;

    public void read() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter account number: ");
        int number = sc.nextInt();

        System.out.print("Enter initial balance: ");
        double amount = sc.nextDouble();

        if (number > 0 && amount >= 0) {
            accountNumber = number;
            balance = amount;
        } else {
            System.out.println("Invalid input. Setting defaults.");
            accountNumber = 0;
            balance = 0.0;
        }
    }

    public void display() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: $" + balance);
    }

    public void updateBalance(double change) {
        if (balance + change >= 0) {
            balance += change;
            System.out.println("Transaction successful.");
        } else {
            System.out.println("Insufficient funds. Transaction denied.");
        }
    }
}

public class AccountRun {
    public static void main(String[] args) {
        Account acc1 = new Account();
        acc1.read();
        acc1.display();

        acc1.updateBalance(500);    
        acc1.updateBalance(-300);   
        acc1.updateBalance(-1500);  

        acc1.display();
    }
}

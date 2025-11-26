import java.util.Scanner;

class Account2 {
    protected String customerName;
    protected String accountNumber;
    protected String accountType;
    protected double balance;

    public Account2(String name, String number, String type, double balance) {
        this.customerName = name;
        this.accountNumber = number;
        this.accountType = type;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Amount deposited successfully. New balance: ₹" + balance);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    public void displayBalance() {
        System.out.println("Current Balance: ₹" + balance);
    }
}

class SavAcct extends Account2 {
    private final double interestRate = 0.04;

    public SavAcct(String name, String number, double balance) {
        super(name, number, "Savings", balance);
    }

    public void computeAndDepositInterest() {
        double interest = balance * interestRate;
        balance += interest;
        System.out.println("Interest of ₹" + interest + " added. New balance: ₹" + balance);
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance!");
        } else if (balance - amount < 500) {
            System.out.println("Cannot withdraw. Minimum balance of ₹500 must be maintained.");
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful. New balance: ₹" + balance);
        }
    }
}

class CurAcct extends Account2 {
    private final double minBalance = 1000;
    private final double penalty = 100;

    public CurAcct(String name, String number, double balance) {
        super(name, number, "Current", balance);
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance!");
            return;
        }
        balance -= amount;
        if (balance < minBalance) {
            balance -= penalty;
            System.out.println("Balance below ₹" + minBalance + ". Penalty of ₹" + penalty + " imposed.");
        }
        System.out.println("Withdrawal successful. New balance: ₹" + balance);
    }
}

public class AccountDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Account2 account = null;

        System.out.print("Enter customer name: ");
        String name = sc.nextLine();
        System.out.print("Enter account number: ");
        String accNo = sc.nextLine();

        System.out.println("Choose account type:");
        System.out.println("1. Savings Account");
        System.out.println("2. Current Account");
        System.out.print("Enter choice: ");
        int choice = sc.nextInt();

        System.out.print("Enter initial balance: ");
        double balance = sc.nextDouble();

        if (choice == 1) {
            account = new SavAcct(name, accNo, balance);
        } else if (choice == 2) {
            account = new CurAcct(name, accNo, balance);
        } else {
            System.out.println("Invalid account type. Exiting...");
            sc.close();
            return;
        }

        int option;
        do {
            System.out.println("\n==== MENU ====");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Display Balance");
            if (account instanceof SavAcct)
                System.out.println("4. Compute and Deposit Interest");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            option = sc.nextInt();

            switch (option) {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    double dep = sc.nextDouble();
                    account.deposit(dep);
                    break;

                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    double w = sc.nextDouble();
                    if (account instanceof SavAcct)
                        ((SavAcct) account).withdraw(w);
                    else if (account instanceof CurAcct)
                        ((CurAcct) account).withdraw(w);
                    break;

                case 3:
                    account.displayBalance();
                    break;

                case 4:
                    if (account instanceof SavAcct)
                        ((SavAcct) account).computeAndDepositInterest();
                    else
                        System.out.println("Interest feature not available for Current Account.");
                    break;

                case 0:
                    System.out.println("Exiting... Thank you!");
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }

        } while (option != 0);

        sc.close();
    }
}

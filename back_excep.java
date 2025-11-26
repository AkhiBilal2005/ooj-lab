import java.util.*;

public class back_excep {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int balance = 5000;

        System.out.print("Enter withdrawal amount: ");

        try {
            int amount = Integer.parseInt(sc.nextLine());

            if (amount > balance) {
                System.out.println("Error: Not enough balance!");
            } else {
                balance -= amount;
                System.out.println("Withdrawal successful. New balance: " + balance);
            }
        } 
        catch (NumberFormatException e) {
            System.out.println("Error: Please enter a number!");
        }
    }
}


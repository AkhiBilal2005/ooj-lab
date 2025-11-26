import java.util.*;

public class items {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take list input
        System.out.print("Enter number of items: ");
        int n = sc.nextInt();
        sc.nextLine();

        ArrayList<String> items = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            items.add(sc.nextLine());
        }

        // Ask for index
        System.out.print("Enter index: ");
        int index = sc.nextInt();

        try {
            System.out.println("Item: " + items.get(index));
        } 
        catch (IndexOutOfBoundsException e) {
            System.out.println("Index out of range!");
        }
    }
}


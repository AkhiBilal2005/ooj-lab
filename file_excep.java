import java.io.*;
import java.util.*;

public class file_excep {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter filename: ");
        String filename = sc.nextLine();

        try {
            FileReader fr = new FileReader(filename);
            System.out.println("File opened successfully!");
            //fr.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error: File does not exist!");
        } finally {
            System.out.println("File open attempt completed.");
        }
    }
}

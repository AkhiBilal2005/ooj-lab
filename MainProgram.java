import java.util.Scanner;
import CIE.*;
import SEE.*;

public class MainProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        Internals[] internal = new Internals[n];
        External[] external = new External[n];

        for (int i = 0; i < n; i++) {
            internal[i] = new Internals();
            external[i] = new External();

            System.out.println("\nEnter details for Student " + (i + 1) + ":");
            sc.nextLine(); 

            System.out.print("Enter USN: ");
            String usn = sc.nextLine();

            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Semester: ");
            int sem = sc.nextInt();

            internal[i].getData(usn, name, sem);
            external[i].getData(usn, name, sem);

            int[] internalMarks = new int[5];
            System.out.println("Enter 5 Internal Marks (out of 50):");
            for (int j = 0; j < 5; j++)
                internalMarks[j] = sc.nextInt();
            internal[i].setMarks(internalMarks);

            int[] seeMarks = new int[5];
            System.out.println("Enter 5 SEE Marks (out of 100):");
            for (int j = 0; j < 5; j++)
                seeMarks[j] = sc.nextInt();
            external[i].setSEE(seeMarks);
        }

        System.out.println("\n----- Final Marks -----");
        for (int i = 0; i < n; i++) {
            internal[i].display();
            System.out.println("Final Marks in 5 Courses:");

            for (int j = 0; j < 5; j++) {
                int finalMarks = internal[i].internalMarks[j] + (external[i].seeMarks[j] / 2);
                System.out.println("Course " + (j + 1) + ": " + finalMarks);
            }
            System.out.println("----------------------------");
        }

        sc.close();
    }
}

import java.util.Scanner;

class Student {
    String USN;
    String student_name;
    int[] credits, marks;
    int n;
    static Scanner sc = new Scanner(System.in);

    Student() {
        System.out.print("Enter USN: ");
        USN = sc.next();
        System.out.print("Enter Student name:");
        student_name = sc.next();
        System.out.print("Enter Number of subjects: ");
        n = sc.nextInt();
        sc.nextLine();
        credits = new int[n];
        marks = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter credits of subject " + (i + 1) + ":");
            credits[i] = sc.nextInt();
            System.out.print("Enter marks of subject " + (i + 1) + ":");
            marks[i] = sc.nextInt();

        }
    }

    void display() {
        System.out.println("Student name:" + (student_name));
        System.out.println("Student USN:" + (USN));
        System.out.println("Student subjects:");
        for (int i = 0; i < n; i++) {
            System.out.println((i) + ") credits: " + (credits[i]) + "| Marks: " + (marks[i]));

        }
    }

    void sgpa() {
        int total_credits = 0;
        double gradepoints = 0;
        for (int i = 0; i < n; i++) {
            total_credits += credits[i];
            if (marks[i] >= 40 && marks[i] < 100) {
                gradepoints += ((marks[i] / 10) + 1) * credits[i];
            } 
            else if (marks[i] == 100) {

                gradepoints += 10 * credits[i];

            }

        }
        System.out.println("Accquried Sgpa is = " + (gradepoints / total_credits));
    }

}

class StudentRun {
    public static void main(String arg[]) {
        Student s1 = new Student();
        s1.display();
        s1.sgpa();
    }
}
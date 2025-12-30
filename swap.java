import java.util.*;
public class swap {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a value(a): ");
        int a = s.nextInt();
        System.out.print("Enter another value(b): ");
        int b = s.nextInt();
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("After swapping "+a+" and "+b);
    }
}

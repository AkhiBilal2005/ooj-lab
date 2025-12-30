import java.util.*;
public class demo {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a value(a): ");
        double a = s.nextDouble();
        System.out.print("Enter another value(b): ");
        double b = s.nextDouble();
        double c = a+b;
        System.out.println("Sum "+c);
        double d = a-b;
        System.out.println("Difference "+d);
        double p = a*b;
        System.out.println("Product "+p);
        if(b!=0){
            double q = a/b;
            System.out.println("Quotient "+q);
        }else{
            System.out.println("Division is not possible!");
        }
    }
}

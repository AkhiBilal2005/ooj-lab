import java.util.*;
class Quad {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the x^2 coefficient: ");
        float a = s.nextFloat();
        System.out.print("Enter the x coefficient: ");
        float b = s.nextFloat();
        System.out.print("Enter the constant: ");
        float c = s.nextFloat();
        float d = (b*b) - (4*a*c);
        if (d>0)
        {
            System.out.println("2 unique solutions: ");
            double r1 = ((-b) + Math.sqrt(d)) / (2*a);
            double r2 = ((-b) - Math.sqrt(d)) / (2*a);
            System.out.print("Roots are " + r1 + " and " + r2);
        }
        else if (d==0)
        {
            System.out.print("Roots are real and equal: ");
            float r1 = (-b)/(2*a);
            System.out.println("Roots are " + r1 + " and " + r1);
        }
        else
        {
            System.out.print("Imaginary roots");
        }
    }
}
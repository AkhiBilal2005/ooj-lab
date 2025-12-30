import java.util.*;
abstract class shape{
    double a;
    double b;
    public abstract double area();
}
class rectangle extends shape{
    double l;
    double b;
    public rectangle(double l,double b){
        this.l = l;
        this.b = b;
    }
    @Override
    public double area(){
        return l*b;
    }
}
class triangle extends shape{
    double h;
    double b;
    public triangle(double h,double b){
        this.h = h;
        this.b = b;
    }
    @Override
    public double area(){
        return (0.5)*h*b;
    }
}
class circle extends shape{
    double r;
    public circle(double r){
        this.r = r;
    }
    @Override
    public double area(){
        return Math.PI*r*r;
    }
}


public class areas {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter length of rectangle: ");
        double m = s.nextDouble();
        System.out.print("Enter breadth of rectangle: ");
        double n = s.nextDouble();
        rectangle r = new rectangle(m,n);
        System.out.print("Enter height of triangle: ");
        double u = s.nextDouble();
        System.out.print("Enter base of triangle: ");
        double v = s.nextDouble();
        triangle t = new triangle(u,v);
        System.out.print("Enter radius of circle: ");
        double x = s.nextDouble();
        circle c = new circle(x);
        System.out.println("Area of rectangle:"+r.area());
        System.out.println("Area of trianlge:"+t.area());
        System.out.println("Area of circle:"+c.area());
    }
    
}

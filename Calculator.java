class ComplexNumber {
    int real;
    int imaginary;

    public ComplexNumber(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    
    public void display() {
        System.out.println(real + " + " + imaginary + "i");
    }
}

public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    
    public ComplexNumber add(ComplexNumber c1, ComplexNumber c2) {
        int realSum = c1.real + c2.real;
        int imaginarySum = c1.imaginary + c2.imaginary;
        return new ComplexNumber(realSum, imaginarySum);
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();

        
        int sumInt = calc.add(5, 7);
        System.out.println("Sum of integers: " + sumInt);

        
        ComplexNumber c1 = new ComplexNumber(3, 4);
        ComplexNumber c2 = new ComplexNumber(5, 6);
        ComplexNumber sumComplex = calc.add(c1, c2);
        System.out.print("Sum of complex numbers: ");
        sumComplex.display();
    }
}

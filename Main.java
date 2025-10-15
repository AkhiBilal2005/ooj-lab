class Car {
    String make;
    String model;
    int year;

   
    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    
    public void displayInfo() {
        System.out.println("Make: " + this.make);
        System.out.println("Model: " + this.model);
        System.out.println("Year: " + this.year);
    }
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Garbage collector called for: " + this.make + " " + this.model);
        super.finalize();
}

    
}

public class main {
    public static void main(String[] args) {
        Car[] cars = new Car[5];

        cars[0] = new Car("Toyota", "Camry", 2020);
        cars[1] = new Car("Honda", "Civic", 2019);
        cars[2] = new Car("Ford", "Mustang", 2021);
        cars[3] = new Car("Tesla", "Model S", 2022);
        cars[4] = new Car("Chevrolet", "Impala", 2018);

        for (Car car : cars) {
            car.displayInfo();
            System.out.println();
        }

        
        cars[1] = null; 
        cars[3] = null; 

        
        System.gc();

        

        System.out.println("End of main method.");
    }
}

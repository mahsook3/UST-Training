public abstract class Vehicle {
    public abstract void displayDetails();
}

class Car extends Vehicle {
    private String model;
    private int year;

    public Car(String model, int year) {
        this.model = model;
        this.year = year;
    }

    @Override
    public void displayDetails() {
        System.out.println("Car Model: " + model + ", Year: " + year);
    }
}

class Bike extends Vehicle {
    private String brand;
    private int cc;

    public Bike(String brand, int cc) {
        this.brand = brand;
        this.cc = cc;
    }

    @Override
    public void displayDetails() {
        System.out.println("Bike Brand: " + brand + ", CC: " + cc);
    }
}

class Problem2 { 
    public static void main(String[] args) {
        Vehicle myCar = new Car("Toyota Camry", 2020);
        Vehicle myBike = new Bike("Yamaha", 150);

        myCar.displayDetails();
        myBike.displayDetails();
    }
}
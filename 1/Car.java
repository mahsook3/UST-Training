public class Car extends Vehicle {
    private String model;

    public Car(String brand, String model) {
        super(brand);
        this.model = model;
    }

    public void displayInfo() {
        System.out.println("Brand: " + getBrand() + ", Model: " + model);
    }

    @Override
    public void drive() {
        System.out.println(getBrand() + " " + model + " is driving.");
    }
}
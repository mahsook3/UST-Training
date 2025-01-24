public class Bike extends Vehicle {
    private boolean hasGear;

    public Bike(String brand, boolean hasGear) {
        super(brand);
        this.hasGear = hasGear;
    }

    public void displayInfo() {
        System.out.println("Brand: " + getBrand() + ", Has Gear: " + hasGear);
    }

    @Override
    public void drive() {
        System.out.println(getBrand() + " bike is riding.");
    }
}
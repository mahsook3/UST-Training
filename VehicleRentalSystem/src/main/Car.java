public class Car extends Vehicle {
    private int numberOfDoors;
    private String fuelType;

    public Car(String vehicleId, String model, double rentalPrice, int numberOfDoors, String fuelType) {
        super(vehicleId, model, rentalPrice);
        this.numberOfDoors = numberOfDoors;
        this.fuelType = fuelType;
    }

    @Override
    public double calculateRentalCost(int days) {
        return days * getRentalPrice();
    }

    @Override
    public void displayDetails() {
        System.out.println("Car ID: " + getVehicleId());
        System.out.println("Model: " + getModel());
        System.out.println("Rental Price: " + getRentalPrice());
        System.out.println("Number of Doors: " + numberOfDoors);
        System.out.println("Fuel Type: " + fuelType);
    }

    // Getters and Setters
    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }
}
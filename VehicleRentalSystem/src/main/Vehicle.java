public abstract class Vehicle {
    private String vehicleId;
    private String model;
    private double rentalPrice;

    public Vehicle(String vehicleId, String model, double rentalPrice) {
        this.vehicleId = vehicleId;
        this.model = model;
        this.rentalPrice = rentalPrice;
    }

    public String getVehicleId() {
        return vehicleId;
    }

    public String getModel() {
        return model;
    }

    public double getRentalPrice() {
        return rentalPrice;
    }

    public abstract double calculateRentalCost(int days);

    public abstract void displayDetails();
}
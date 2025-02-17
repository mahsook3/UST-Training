public class Truck extends Vehicle {
    private double loadCapacity; // in tons
    private String truckType; // e.g., pickup, flatbed

    public Truck(String vehicleId, String model, double rentalPrice, double loadCapacity, String truckType) {
        super(vehicleId, model, rentalPrice);
        this.loadCapacity = loadCapacity;
        this.truckType = truckType;
    }

    public double getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(double loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    public String getTruckType() {
        return truckType;
    }

    public void setTruckType(String truckType) {
        this.truckType = truckType;
    }

    @Override
    public double calculateRentalCost(int rentalDays) {
        return rentalDays * getRentalPrice();
    }

    @Override
    public void displayDetails() {
        System.out.println("Truck ID: " + getVehicleId());
        System.out.println("Model: " + getModel());
        System.out.println("Rental Price: " + getRentalPrice());
        System.out.println("Load Capacity: " + loadCapacity + " tons");
        System.out.println("Truck Type: " + truckType);
    }
}
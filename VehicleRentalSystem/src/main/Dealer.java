import java.util.ArrayList;
import java.util.List;

public class Dealer {
    private String dealerId;
    private String name;
    private List<Vehicle> vehicles;

    public Dealer(String dealerId, String name) {
        this.dealerId = dealerId;
        this.name = name;
        this.vehicles = new ArrayList<>();
    }

    public String getDealerId() {
        return dealerId;
    }

    public String getName() {
        return name;
    }

    public List<Vehicle> getVehicles() {
        return vehicles;
    }

    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    public void removeVehicle(Vehicle vehicle) {
        vehicles.remove(vehicle);
    }

    public void displayVehicles() {
        for (Vehicle vehicle : vehicles) {
            vehicle.displayDetails();
        }
    }
}
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class VehicleStore {
    private List<Vehicle> vehicles;
    private List<Order> orders;

    public VehicleStore() {
        vehicles = new ArrayList<>();
        orders = new ArrayList<>();
    }

    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    public void removeVehicle(Vehicle vehicle) {
        vehicles.remove(vehicle);
    }

    public List<Vehicle> getAvailableVehicles() {
        return vehicles.stream()
                .filter(vehicle -> !isVehicleRented(vehicle))
                .collect(Collectors.toList());
    }

    private boolean isVehicleRented(Vehicle vehicle) {
        return orders.stream()
                .anyMatch(order -> order.getVehicle().equals(vehicle));
    }

    public void processOrder(Order order) {
        if (vehicles.contains(order.getVehicle()) && !isVehicleRented(order.getVehicle())) {
            orders.add(order);
        } else {
            throw new IllegalArgumentException("Vehicle is not available for rent.");
        }
    }

    public List<Order> getOrders() {
        return orders;
    }
}
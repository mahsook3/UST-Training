import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Order {
    private String orderId;
    private Customer customer;
    private Vehicle vehicle;
    private String rentalStartDate;
    private String rentalEndDate;

    public Order(String orderId, Customer customer, Vehicle vehicle, String rentalStartDate, String rentalEndDate) {
        this.orderId = orderId;
        this.customer = customer;
        this.vehicle = vehicle;
        this.rentalStartDate = rentalStartDate;
        this.rentalEndDate = rentalEndDate;
    }

    public String getOrderId() {
        return orderId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public String getRentalStartDate() {
        return rentalStartDate;
    }

    public String getRentalEndDate() {
        return rentalEndDate;
    }

    public double calculateTotalRentalCost() {
        return vehicle.getRentalPrice() * calculateRentalDuration();
    }

    private int calculateRentalDuration() {
        LocalDate start = LocalDate.parse(rentalStartDate);
        LocalDate end = LocalDate.parse(rentalEndDate);
        return (int) ChronoUnit.DAYS.between(start, end);
    }

    public void displayOrderDetails() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Customer: " + customer.getName());
        System.out.println("Vehicle: " + vehicle.getModel());
        System.out.println("Rental Start Date: " + rentalStartDate);
        System.out.println("Rental End Date: " + rentalEndDate);
        System.out.println("Total Rental Cost: " + calculateTotalRentalCost());
    }
}
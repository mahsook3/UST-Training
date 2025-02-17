import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initialize the vehicle rental system
        VehicleStore vehicleStore = new VehicleStore();

        // Create some customers
        System.out.print("Enter customer ID: ");
        String customerId1 = scanner.nextLine();
        System.out.print("Enter customer name: ");
        String customerName1 = scanner.nextLine();
        System.out.print("Enter customer email: ");
        String customerEmail1 = scanner.nextLine();
        Customer customer1 = new Customer(customerId1, customerName1, customerEmail1);

        System.out.print("Enter customer ID: ");
        String customerId2 = scanner.nextLine();
        System.out.print("Enter customer name: ");
        String customerName2 = scanner.nextLine();
        System.out.print("Enter customer email: ");
        String customerEmail2 = scanner.nextLine();
        Customer customer2 = new Customer(customerId2, customerName2, customerEmail2);

        // Create some vehicles
        System.out.print("Enter car ID: ");
        String carId = scanner.nextLine();
        System.out.print("Enter car model: ");
        String carModel = scanner.nextLine();
        System.out.print("Enter car rental price: ");
        double carRentalPrice = scanner.nextDouble();
        System.out.print("Enter car seats: ");
        int carSeats = scanner.nextInt();
        scanner.nextLine(); // consume the newline
        System.out.print("Enter car fuel type: ");
        String carFuelType = scanner.nextLine();
        Vehicle car1 = new Car(carId, carModel, carRentalPrice, carSeats, carFuelType);

        System.out.print("Enter truck ID: ");
        String truckId = scanner.nextLine();
        System.out.print("Enter truck model: ");
        String truckModel = scanner.nextLine();
        System.out.print("Enter truck rental price: ");
        double truckRentalPrice = scanner.nextDouble();
        System.out.print("Enter truck load capacity: ");
        double truckLoadCapacity = scanner.nextDouble();
        scanner.nextLine(); // consume the newline
        System.out.print("Enter truck type: ");
        String truckType = scanner.nextLine();
        Vehicle truck1 = new Truck(truckId, truckModel, truckRentalPrice, truckLoadCapacity, truckType);

        // Add vehicles to the store
        vehicleStore.addVehicle(car1);
        vehicleStore.addVehicle(truck1);

        // Create an order
        System.out.print("Enter order ID: ");
        String orderId = scanner.nextLine();
        System.out.print("Enter rental start date (YYYY-MM-DD): ");
        String startDate = scanner.nextLine();
        System.out.print("Enter rental end date (YYYY-MM-DD): ");
        String endDate = scanner.nextLine();
        Order order1 = new Order(orderId, customer1, car1, startDate, endDate);

        // Process the order
        vehicleStore.processOrder(order1);

        // Display order details
        order1.displayOrderDetails();

        scanner.close();
    }
}
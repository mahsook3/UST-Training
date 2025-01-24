public class AbstractDemo {
    public static void main(String[] args) {
        Vehicle car = new Car("Ford", "Mustang");
        car.drive();
        
        Vehicle bike = new Bike("Yamaha", true);
        bike.drive();
    }
}
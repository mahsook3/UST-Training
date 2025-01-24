public abstract class Vehicle {
    public abstract void move();
}

class Car extends Vehicle {
    @Override
    public void move() {
        System.out.println("The car drives on the road.");
    }
}

class Bike extends Vehicle {
    @Override
    public void move() {
        System.out.println("The bike pedals on the path.");
    }
}
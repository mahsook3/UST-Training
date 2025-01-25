public abstract class Device {
    public abstract void turnOff();
}

class Laptop extends Device {
    @Override
    public void turnOff() {
        System.out.println("Laptop is shutting down.");
    }
}

class Smartphone extends Device {
    @Override
    public void turnOff() {
        System.out.println("Smartphone is powering off.");
    }
}
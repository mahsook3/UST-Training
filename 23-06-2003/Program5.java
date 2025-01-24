public abstract class Appliance {
    public abstract void turnOn();
}

class WashingMachine extends Appliance {
    @Override
    public void turnOn() {
        System.out.println("Washing Machine is now running.");
    }
}

class Refrigerator extends Appliance {
    @Override
    public void turnOn() {
        System.out.println("Refrigerator is now cooling.");
    }
}
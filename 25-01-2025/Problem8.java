public abstract class Product {
    public abstract void displayDetails();
}

class Electronics extends Product {
    private String brand;
    private String model;

    public Electronics(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    @Override
    public void displayDetails() {
        System.out.println("Electronics Product: " + brand + " " + model);
    }
}

class Clothing extends Product {
    private String brand;
    private String size;

    public Clothing(String brand, String size) {
        this.brand = brand;
        this.size = size;
    }

    @Override
    public void displayDetails() {
        System.out.println("Clothing Product: " + brand + " Size: " + size);
    }
}

public class Problem8 {
    public static void main(String[] args) {
        Product myElectronics = new Electronics("Samsung", "Galaxy S21");
        Product myClothing = new Clothing("Nike", "M");

        myElectronics.displayDetails();
        myClothing.displayDetails();
    }
}
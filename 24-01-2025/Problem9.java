public class Problem9 {
    public static void main(String[] args) {
        Animal animal = new Dog(); // Upcasting
        animal.sound(); // Calls Dog's sound method

        if (animal instanceof Dog) {
            Dog dog = (Dog) animal; // Downcasting
            dog.fetch(); // Calls Dog's fetch method
        }

        animal = new Cat(); // Upcasting
        animal.sound(); // Calls Cat's sound method

        if (animal instanceof Cat) {
            Cat cat = (Cat) animal; // Downcasting
            cat.climb(); // Calls Cat's climb method
        }
    }
}

class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }

    void fetch() {
        System.out.println("Dog fetches the ball");
    }
}

class Cat extends Animal {
    void sound() {
        System.out.println("Cat meows");
    }

    void climb() {
        System.out.println("Cat climbs the tree");
    }
}
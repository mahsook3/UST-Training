public class Problem7 {
    // Superclass
    class Animal {
        void sound() {
            System.out.println("Animal makes a sound");
        }
        
        Animal() {
            System.out.println("Animal constructor called");
        }
    }

    // Subclass
    class Dog extends Animal {
        void sound() {
            System.out.println("Dog barks");
        }
        
        Dog() {
            super(); // Calling the superclass constructor
            System.out.println("Dog constructor called");
        }
    }

    public static void main(String[] args) {
        Problem7 example = new Problem7();
        Dog dog = example.new Dog();
        dog.sound(); // Demonstrating method overriding
    }
}
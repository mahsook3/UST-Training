public class Problem1 {
    class Animal {
        void sound() {
            System.out.println("Animal makes a sound");
        }
    }

    class Dog extends Animal {
        @Override
        void sound() {
            System.out.println("Dog barks");
        }
    }

    public static void main(String[] args) {
        Problem1 example = new Problem1();
        Animal myDog = example.new Dog(); 
        myDog.sound(); 
    }
}
public class Problem10 {
    public static void main(String[] args) {
        // Demonstrating method overriding
        Problem1 dog = new Dog();
        Problem1 cat = new Cat();
        dog.makeSound(); // Output: Woof
        cat.makeSound(); // Output: Meow

        // Demonstrating method overloading
        Problem2 math = new Problem2();
        System.out.println(math.add(5, 10)); // Output: 15
        System.out.println(math.add(5.5, 10.5)); // Output: 16.0

        // Demonstrating abstract class
        Problem3 animal = new Dog();
        animal.makeSound(); // Output: Woof

        // Demonstrating interface
        Problem4 vehicle = new Car();
        vehicle.start(); // Output: Car is starting

        // Demonstrating dynamic method dispatch
        Problem5 animalRef = new Cat();
        animalRef.makeSound(); // Output: Meow

        // Demonstrating inheritance
        Problem6 child = new Child();
        child.display(); // Output: Child class method

        // Demonstrating super keyword
        Problem7 childWithSuper = new ChildWithSuper();
        childWithSuper.display(); // Output: Parent class method

        // Demonstrating multiple inheritance through interfaces
        Problem8 multiInherit = new MultiInherit();
        multiInherit.methodA(); // Output: Method A
        multiInherit.methodB(); // Output: Method B

        // Demonstrating casting
        Problem9 castedAnimal = (Problem9) animalRef;
        castedAnimal.display(); // Output: Cat class method
    }
}
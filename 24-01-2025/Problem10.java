public class Problem10 {
    public static void main(String[] args) {
        Problem1 dog = new Dog();
        Problem1 cat = new Cat();
        dog.makeSound(); // Output: Woof
        cat.makeSound(); // Output: Meow

        Problem2 math = new Problem2();
        System.out.println(math.add(5, 10)); // Output: 15
        System.out.println(math.add(5.5, 10.5)); // Output: 16.0

        Problem3 animal = new Dog();
        animal.makeSound(); // Output: Woof

        Problem4 vehicle = new Car();
        vehicle.start(); // Output: Car is starting

        Problem5 animalRef = new Cat();
        animalRef.makeSound(); // Output: Meow

        Problem6 child = new Child();
        child.display(); // Output: Child class method

        Problem7 childWithSuper = new ChildWithSuper();
        childWithSuper.display(); // Output: Parent class method

        Problem8 multiInherit = new MultiInherit();
        multiInherit.methodA(); // Output: Method A
        multiInherit.methodB(); // Output: Method B

        Problem9 castedAnimal = (Problem9) animalRef;
        castedAnimal.display(); // Output: Cat class method
    }
}
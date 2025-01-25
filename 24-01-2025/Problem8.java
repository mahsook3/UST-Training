public interface Animal {
    void sound();
}

public interface Pet {
    void play();
}

public class Dog implements Animal, Pet {
    @Override
    public void sound() {
        System.out.println("Bark");
    }

    @Override
    public void play() {
        System.out.println("The dog is playing fetch.");
    }
}

public class Cat implements Animal, Pet {
    @Override
    public void sound() {
        System.out.println("Meow");
    }

    @Override
    public void play() {
        System.out.println("The cat is playing with a ball of yarn.");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        myDog.sound();
        myCat.sound();

        Pet petDog = new Dog();
        Pet petCat = new Cat();

        petDog.play();
        petCat.play();
    }
}
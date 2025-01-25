public class Animal {
    public void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    @Override
    public void sound() {
        System.out.println("Cat meows");
    }
}

class Bird extends Animal {
    @Override
    public void sound() {
        System.out.println("Bird chirps");
    }
}

public class Problem6 {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        Animal myCat = new Cat();
        Animal myBird = new Bird();

        myDog.sound();
        myCat.sound();
        myBird.sound();
    }
}
public abstract class Character {
    public abstract void performAction();
}

class Warrior extends Character {
    @Override
    public void performAction() {
        System.out.println("Warrior swings sword!");
    }
}

class Mage extends Character {
    @Override
    public void performAction() {
        System.out.println("Mage casts a spell!");
    }
}

public class Problem9 {
    public static void main(String[] args) {
        Character myWarrior = new Warrior();
        Character myMage = new Mage();

        myWarrior.performAction();
        myMage.performAction();
    }
}
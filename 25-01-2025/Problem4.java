public abstract class Book {
    public abstract void displayInfo();
}

class Fiction extends Book {
    private String title;
    private String author;

    public Fiction(String title, String author) {
        this.title = title;
        this.author = author;
    }

    @Override
    public void displayInfo() {
        System.out.println("Fiction Book: " + title + " by " + author);
    }
}

class NonFiction extends Book {
    private String title;
    private String author;

    public NonFiction(String title, String author) {
        this.title = title;
        this.author = author;
    }

    @Override
    public void displayInfo() {
        System.out.println("Non-Fiction Book: " + title + " by " + author);
    }
}

public class Problem4 {
    public static void main(String[] args) {
        Book myFiction = new Fiction("1984", "George Orwell");
        Book myNonFiction = new NonFiction("Sapiens", "Yuval Noah Harari");

        myFiction.displayInfo();
        myNonFiction.displayInfo();
    }
}
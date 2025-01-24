public abstract class Book {
    public abstract String getGenre();
}

class Fiction extends Book {
    @Override
    public String getGenre() {
        return "Fiction";
    }
}

class NonFiction extends Book {
    @Override
    public String getGenre() {
        return "Non-Fiction";
    }
}
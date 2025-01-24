public class Library {
    private List<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void displayGenres() {
        for (Book book : books) {
            System.out.println("Genre: " + book.getGenre());
        }
    }

    public static void main(String[] args) {
        Library library = new Library();

        Book fictionBook = new Fiction("The Great Gatsby");
        Book nonFictionBook = new NonFiction("Sapiens: A Brief History of Humankind");

        library.addBook(fictionBook);
        library.addBook(nonFictionBook);

        library.displayGenres();
    }
}
public class Book {
    private final String title;
    private final String author;
    private final int year;
    private final double price;
    private final String category;
    private final String isbn;

    // 👇 Constructor package-private
    Book(String title, String author, int year, double price, String category, String isbn) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.price = price;
        this.category = category;
        this.isbn = isbn;
    }

    // 👇 Public factory method
    public static Book of(String title, String author, int year, double price, String category, String isbn) {
        return new Book(title, author, year, price, category, isbn);
    }

    // ✅ Only getters, no setters
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public int getYear() { return year; }
    public double getPrice() { return price; }
    public String getCategory() { return category; }
    public String getIsbn() { return isbn; }
}

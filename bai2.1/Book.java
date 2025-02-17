public class Book {
    private String title;
    private Author author;
    private double price;
    
    public Book(String title, Author author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
    
    public String getTitle() {
        return title;
    }
    
    public Author getAuthor() {
        return author;
    }
    
    public double getPrice() {
        return price;
    }
    
    public void setPrice(double price) {
        this.price = price;
    }
    
    @Override
    public String toString() {
        return "Book[title=" + title + ", author=" + author + ", price=" + price + "]";
    }
}

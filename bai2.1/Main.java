public class Main {
    public static void main(String[] args) {
        Author author = new Author("John Doe", "john.doe@example.com");
        Book book = new Book("Java Programming", author, 29.99);
        
        System.out.println(book);
        
       
        author.setEmail("thienlt@gmail .com");
        System.out.println("Updated Author Email: " + author.getEmail());
    }
}

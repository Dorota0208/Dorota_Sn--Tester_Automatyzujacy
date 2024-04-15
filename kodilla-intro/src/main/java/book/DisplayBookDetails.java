package book;
public class DisplayBookDetails {
    public static void main(String[] args) {
        Book book = Book.of("Isaac Asimov", "The Galaxy");
        System.out.println("Author: " + book.getAuthor() + ", Title: " + book.getTitle());
    }
}


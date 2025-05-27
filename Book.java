public class Book {
    private String bookName;
    private String author;
    private String publisher;
    private double price;
    private int yearOfPublished;

    public Book(String bookName, String author, String publisher, double price, int yearOfPublished) {
        this.bookName = bookName;
        this.author = author;
        this.publisher = publisher;
        this.price = price;
        this.yearOfPublished = yearOfPublished;
    }

    public void display() {
        System.out.println("Book Name: " + bookName);
        System.out.println("Author: " + author);
        System.out.println("Publisher: " + publisher);
        System.out.println("Price: $" + price);
        System.out.println("Year of Published: " + yearOfPublished);
    }

    public static void main(String[] args) {
        Book book = new Book("It ends with us", "collen hover", "chetan bhagat",100.0, 2000);
        book.display();
}
}

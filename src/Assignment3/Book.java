package Assignment3;

import java.time.LocalDate;

public class Book {

    // Attributes of the Book class
    public String name;
    public String authorName;
    public double price;
    public String publisherName;
    public String genre;
    public String ISBN;
    public LocalDate dateOfPublishing;

    // Parameterized Constructor
    public Book(String name, String authorName, double price, String publisherName, String genre, String ISBN, LocalDate dateOfPublishing)
            throws InvalidPriceException {
        if (price < 0) {
            throw new InvalidPriceException("Price cannot be Negative");
        }

        this.name = name;
        this.authorName = authorName;
        this.price = price;
        this.publisherName = publisherName;
        this.genre = genre;
        this.ISBN = ISBN;
        this.dateOfPublishing = dateOfPublishing;
    }

    // Default Constructor
    public Book() {
        this.name = "Unknown";
        this.authorName = "Unknown";
        this.price = 0.0;
        this.publisherName = "Unknown";
        this.genre = "Unknown";
        this.ISBN = "Unknown";
        this.dateOfPublishing = LocalDate.now();
    }

    // Method to display book details
    public void displayDetails() {
        System.out.println("Book Name: " + name);
        System.out.println("Author Name: " + authorName);
        System.out.println("Price: $" + price);
        System.out.println("Publisher Name: " + publisherName);
        System.out.println("Genre: " + genre);
        System.out.println("ISBN: " + ISBN);
        System.out.println("Date of Publishing: " + dateOfPublishing);
    }

    public static void main(String[] args) {
        try {
            // Creating a book object using the parameterized constructor
            Book book1 = new Book("The Great Gatsby",
                    "F. Scott Fitzgerald",
                    10.99,
                    "Scribner",
                    "Fiction",
                    "978-0743273565",
                    LocalDate.of(1925, 4, 10)
            );
            book1.displayDetails();
        } catch (InvalidPriceException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println();

        // Creating a book object using the default constructor
        Book book2 = new Book();
        book2.displayDetails();
    }
}

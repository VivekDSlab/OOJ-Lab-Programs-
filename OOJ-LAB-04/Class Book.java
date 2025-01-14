import java.util.*;
import java.util.Scanner;
class Book {
    String name;
    String author;
    double price;
    int numPages;
    public Book(String name, String author, double price, int numPages) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.numPages = numPages;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public void setNumPages(int numPages) {
        this.numPages = numPages;
    }
    public String getName() {
        return name;
    }
    public String getAuthor() {
        return author;
    }
    public double getPrice() {
        return price;
    }
    public int getNumPages() {
        return numPages;
    }
    public void displayDetails() {
        System.out.println("Book Name: " + name);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
        System.out.println("Number of Pages: " + numPages);
    }
    public String toString() {
        return "Book Name: " + name + ", Author: " + author + ", Price: $" + price + ", Pages: " + numPages;
    }
}
public class BookStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Book> books = new ArrayList<>();
        System.out.print("Enter the number of books you want to create: ");
        int n = scanner.nextInt();
        scanner.nextLine(); 
        for (int i = 0; i < n; i++) {
            System.out.println("\nEntering details for book " + (i + 1) + ":");
            System.out.print("Enter book name: ");
            String name = scanner.nextLine();
            System.out.print("Enter author name: ");
            String author = scanner.nextLine();
            System.out.print("Enter price: ");
            double price = scanner.nextDouble();
            System.out.print("Enter number of pages: ");
            int numPages = scanner.nextInt();
            scanner.nextLine(); 
            Book book = new Book(name, author, price, numPages);
            books.add(book);
        }
        System.out.println("\nBook Details:");
        for (Book book : books) {
            book.displayDetails();
            System.out.println(book); 
            System.out.println();
        }
        scanner.close();
    }
}

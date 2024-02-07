package practicals.Bookstore;

import practicals.Bookstore.core.Book;
import practicals.Bookstore.inventory.*;

public class Exp22 {
    public static void main(String[] args) {
        // Creating a sample book
        Book sampleBook = new Book("Jiyaa's Biography", "Jiyaaa", "123456789", 98.88);

        // Creating an inventory manager and adding the sample book
        InventoryManager inventoryManager = new InventoryManager();
        inventoryManager.addBook(sampleBook);

        // Retrieving and printing book details
        Book retrievedBook = inventoryManager.getBookDetails("123456789");
        if (retrievedBook != null) {
            System.out.println("Book Details:\nTitle: " + retrievedBook.getTitle()
                    + "\nAuthor: " + retrievedBook.getAuthor()
                    + "\nISBN: " + retrievedBook.getIsbn()
                    + "\nPrice: " + retrievedBook.getPrice());
        }

        // Updating stock level
        inventoryManager.updateStockLevel("123456789", 50);
    }
}


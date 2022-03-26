// @author Joseph Walker

// Simple Java program using ArrayLists and provides an example of a 
// bookstore a user can search for books in. Contains three classes: 

// - Book class, encapsulating the concept of a book
// - BookStore class, encapsulating the concept of a bookstore
// - BookSearchEngine class, including the main method, which provides our UI

import java.util.*;

public class BookSearchEnging {

	public static void main(String[] args) {
		
		BookStore bs = new BookStore();
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("enter a keyword >");
		String keyword = scan.nextLine();
		System.out.println("Our book coolction is:");
		System.out.println(bs.toString());
		
		ArrayList<Book> results = bs.searchForTitle(keyword);
		
		System.out.println("The search results for " + keyword + " are:");
		
		for (Book tempBook : results) {
			System.out.println(tempBook.toString());
		}

	}

}
// in this class, we instantiate our ArrayLists for the 
// bookstore search engine

import java.util.ArrayList;

public class BookStore {

// our BookStore class will ONLY have this one instance variable
// this ArrayList represents the collection of books in the bookstore
// which we here name "library"
	
	private ArrayList<Book> library;
	
// default constructor which instantiates our ArrayList of Books
// we instantiate the library instance variable, then add six Book objects 
// to library using the add method from the ArrayList class.
	
	public BookStore() {
		library = new ArrayList<Book>();
		
		library.add(new Book("Intro to Java", "James", 56.99));
		library.add(new Book("Advanced Java", "Green", 65.99));
		library.add(new Book("Java Applets", "Brown", 75.99));
		library.add(new Book("Intro to HTML", "James", 29.49));
		library.add(new Book("Intro to Flash", "Joseph", 34.99));
		library.add(new Book("Advanced CSS", "Green", 56.99));
		
// we call the trimToSize method to set the capacity of library 
// to its current size, (which is 6), in order to minimize the 
// memory resources used.
		
		library.trimToSize();
	}
	
// Next we create our toString method. It generates and returns a String 
// representing all the books in library, one book per line. In order to 
// do that, we use an enhanced for loop.
	
	public String toString() {
		String result = "";
		
// The header of our enhanced for loop follows the general pattern of the 
// enhanced for loop header by declaring a Book variable named tempBook, 
// followed by a colon, followed by library, the ArrayList object to loop through.
		
		for(Book tempBook : library) {
			result += tempBook.toString() + "\n";
		}
		return result;
		}
// The searchForTitle method  performs the task of searching for a keyword within 
// the title of each Book object stored in library. The keyword, a String, is the 
// parameter of the method and is named searchString. This method returns an ArrayList 
// containing the Book objects that have the keyword in their title.
	
	public ArrayList<Book> searchForTitle(String searchString){
		ArrayList<Book> searchResult = new ArrayList<Book>();
		
// We create that ArrayList of Books, which we name searchResult and loop through library 
// using an enhanced for loop. Inside the body of the loop, we use the indexOf method of 
// the String class to test if the current Book object contains the keyword searchString 
// in its title. If it does, we add that Book object to searchResult. 
		
		for(Book currentBook : library) {
			if(currentBook.getTitle().indexOf(searchString) != -1) {
				searchResult.add(currentBook);
			}
			
// Finally, we call the method trimToSize to set the capacity of searchResult to the current 
// number of elements, then return the ArrayList to the caller.
			
			searchResult.trimToSize();
		}
			return searchResult;
			}
		}
	

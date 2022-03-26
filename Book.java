
public class Book {
	
// our instance variables
	
	private String title;
	private String author;
	private double price;
	
// Overloaded Constructor
	
	public Book(String title, String author, double price) {
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
// ***** Create getter/setter methods for insance variables
	
	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}
	
	public double getPrice() {
		return price;
	}
	
// toString method to tie our instance variables together
	
	public String toString() {
		return ("Title " + title + "\t" + "author: " + author
				+ "\t" + "price: " + price);
	} 
}
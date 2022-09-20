package objects;

public class Book {
	private String bookTitle;
	private String authorsName;
	private String category;
	private int bookID;
	private int year;
	
	
	public void setBook(String title, String author, String category, int year, int id) {
		setBookTitle(title);
		setBookAuthor(author);
		setCategory(category);
		setYear(year);
		setBookID(id);
	}
	
	String getBookTitle(){ return new String(bookTitle); }
	String getBookAuthor() {return new String(authorsName); }
	String getCategory() { return new String(category); }
	int getBookID() { return bookID; }
	int getYear() { return year; }
	
	
	void setBookTitle(String title){  
		bookTitle = new String(title);
	}
	void setBookAuthor(String author) {
		this.authorsName = new String(author);	
	}
	void setCategory(String category ) { 
		this.category = new String(category); 
	}
	void setBookID(int bookID) { 
		this.bookID = bookID; 
	}
	void setYear(int year) {
		this.year = year;
	}
	
}

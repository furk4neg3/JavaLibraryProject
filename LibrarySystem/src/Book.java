
public class Book {
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public int getPublicationYear() {
		return publicationYear;
	}
	public void setPublicationYear(int publicationYear) {
		this.publicationYear = publicationYear;
	}
	public int getAvailableCopies() {
		return availableCopies;
	}
	public void setAvailableCopies(int availableCopies) {
		this.availableCopies = availableCopies;
	}
	private String bookName;
	private String author;
	private String isbn;
	private String publisher;
	private int publicationYear;
	private int availableCopies;
	
	Book(String bookName, String author, String isbn, String publisher, int publicationYear, int availableCopies){
		setBookName(bookName);
		setAuthor(author);
		setIsbn(isbn);
		setPublisher(publisher);
		setPublicationYear(publicationYear);
		setAvailableCopies(availableCopies);
	}
	
	public void showBookDetails() {
		System.out.println("Name: " + getBookName());
		System.out.println("Author: " + getAuthor());
		System.out.println("ISBN: " + getIsbn());
		System.out.println("Publisher: " + getPublisher());
		System.out.println("Publication year: " + getPublicationYear());
		System.out.println("Number of available copies: " + getAvailableCopies());
	}
}

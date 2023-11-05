
public class User {
	public Book getBorrowedBook() {
		return borrowedBook;
	}
	public void setBorrowedBook(Book borrowedBook) {
		this.borrowedBook = borrowedBook;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getUserNo() {
		return userNo;
	}
	public void setUserNo(int userNo) {
		this.userNo = userNo;
	}
	
	private String username;
	private int userNo;
	private Book borrowedBook;
	
	User(String username, int userNo){
		setUsername(username);
		setUserNo(userNo);
		setBorrowedBook(null);
	}
	
	public void borrowBook(Book book) {
		if(borrowedBook != null) {
			System.out.println(getUsername() + " already borrowed a book.");
		}else if(book.getAvailableCopies() >= 1){
			System.out.println(getUsername() + " borrowed " + book.getBookName());
			book.setAvailableCopies(book.getAvailableCopies()- 1);
			borrowedBook = book;
		}else {
			System.out.println("This book is not available at the moment.");
		}
	}
	
	public void returnBook(Book book) {
		if(borrowedBook.getIsbn() == book.getIsbn()) {
			System.out.println(getUsername() + " has returned " + book.getBookName() + ".");
			borrowedBook = null;
			book.setAvailableCopies(book.getAvailableCopies() + 1);
		}else {
			System.out.println(getUsername() + " did not borrow " + book.getBookName() + " so can't return it.");
		}
	}
	
	
}
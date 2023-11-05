
public class Library {
	User usersList[];
	Book booksList[];
	Library(int maxUser, int maxBook){
		usersList = new User[maxUser];
		booksList = new Book[maxBook];
	}
	
	public void addBook(Book book){
		for(int i = 0; i <= booksList.length; i++) {
			if(booksList[i] == null) {
				booksList[i] = book;
				System.out.println(book.getBookName()  + " has been successfully added to library.");
				return;
			}
		}
		System.out.println("No space in the library. Book can not be added.");
	}	
	
	public Book searchBook(String isbn) {
		for(int i = 0; i <= booksList.length; i++) {
			if(booksList[i].getIsbn().equals(isbn)) {
				return booksList[i];
			}
		}
		System.out.println("Library does not have this book.");
		return null;
	}
	
	public void addUser(User user) {
		for(int i = 0; i <= usersList.length; i++) {
			if(usersList[i] == null) {
				usersList[i] = user;
				System.out.println(user.getUsername() + " has been sucsessfully added to users.");
				return;
			}		
		}
		System.out.println("Library is at the max capacity of users.");
	}
}

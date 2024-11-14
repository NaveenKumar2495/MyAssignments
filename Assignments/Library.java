package week1.Assignments;

public class Library {

	public String addBook(String bookTitle) {
		System.out.println("Book added successfully");
		return bookTitle ;
	}
	
	public void issuebook() {
		System.out.println("Book issued successfully");
	}
	
	
	public static void main(String[] args) {
		Library temp = new Library() ;
		String temp2 = temp.addBook("Ikigai") ;
		System.out.println(temp2);
		temp.issuebook();

	}

}

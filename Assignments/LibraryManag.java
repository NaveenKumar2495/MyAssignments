package week1.Assignments;

public class LibraryManag {

	public static void main(String[] args) {
		Library temp = new Library() ;
		String temp2 = temp.addBook("Ikigai") ;
		System.out.println(temp2);
		temp.issuebook();

	}

}

package week1.Assignments;

public class PalindromeNumber {

	public static void main(String[] args) {
		int input = 1991 ;
		int a = input ;
		int reverse = 0 ;

		while(a!=0) {
			int rem = a%10 ;
			reverse = reverse*10 + rem ; 
			a = a/10 ;
			
		}
		System.out.println(reverse);
		
		if (input == reverse) {
			System.out.println("Given number "+input+" is a Palindrome number");
		}
		else {
			System.out.println("Given number "+input+" is not a Palindrome number");
		}
	}

}

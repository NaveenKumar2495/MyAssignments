package week1.Assignments;

public class IsPrimeNumber {

	public static void main(String[] args) {
		
		int number = 21 ;
		int j = 0 ;
		
		if(number==0 || number == 1) {
			j=j+1 ;			 
		}
				
		for(int i =2; i<number ; i++ ) {
		if(number%i == 0) {
			j =j+1 ;
		}
		}
		System.out.println(number+ " can be divided "+j+" times");
		if (j>0) {
			System.out.println(number+ " is not a prime number");	
		}
		else {
		System.out.println(number+ " is a prime number");	
		}
	}

}

package week1.Assignments;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		int a=0, b=1, c=0 ;
		System.out.println(a);
		System.out.println(b);
		
		int count = 8 ;
		
		for(int i=0 ; i < count-2 ;i++  ) {
			c=a+b ;
			System.out.println(c);
			a=b;
			b=c;
		}
		

	}

}

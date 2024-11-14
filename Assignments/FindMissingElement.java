package week1.Assignments;

import java.util.Arrays;

public class FindMissingElement {

	public static void main(String[] args) {
		int [] a = {1,4,3,2,8,6,7} ;
		
		Arrays.sort(a);
		int len = a.length ;
		int sum2 = 0;
		int b = a[len-1];
		System.out.println("The last number in array is " +b);
		for (int i=0; i<len ; i++) {
			sum2 = sum2+a[i] ;
		}
		System.out.println("The sum of the given array is "+sum2);
	
		int sum1 = (b*(b+1))/2 ;
		
		int c = sum1 -sum2 ;
		System.out.println("The missing number in the array is "+c);
	}

}

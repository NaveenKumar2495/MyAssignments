package week1.Assignments;

public class FindIntersection {

	public static void main(String[] args) {
		
		int [] a = {3,2,11,4,6,7};
		int [] b = {1,2,8,4,9,7} ;

		int k = a.length ;
		int l = b.length ;
				
		for (int i=0 ;i<k ; i++) {
		for (int j=0 ;j<l ; j++) {
			if(a[i] == b[j]) {
				System.out.println(a[i] +"is a match");
			}
		}
		}
		
		
		
	}

}

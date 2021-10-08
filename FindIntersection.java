package Assignment.Day2;

public class FindIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Array Initialization
		int[] num = {3,2,11,4,6,7};
		int[] num1= {1,2,8,4,9,7};
		
		//loop1
		for ( int i=0; i<num.length; i++) {
			//loop2
			for ( int j=0; j<num1.length; j++) {
				
				//Comparing 2 Arrays
				
				if ( num[i]==num1[j]) {
					System.out.println("Intersection Number of Arrays:"+ num[i] );
				}
			}
		
			
			
		}
			
		
	}

}

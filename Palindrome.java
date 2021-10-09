package Assignment.Day2;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Word = "Madam";
		String Word2 = "";
		
		for ( int i = Word.length()-1; i>=0; i--) {
		
			Word2 = Word2 + Word.charAt(i);		
		}
		System.out.println("Reverse a String :"+ " " +Word2);	
		if(Word2.equals(Word2))
			System.out.println("It is a Palindrome:" );
		else 
			System.out.println("It is not a Palindrome:" );
		
			
		}
		
	}



package Assignment.Day2;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
			//declare string
			String test="changeme";
			
			//convert string to character array
			
			char[] ch= test.toCharArray();
			
			//Traverse through each character (using loop)
			for(int i=0; i<ch.length; i++)
				
			{
				//find the odd index within the loop (use mod operator)
				if(i%2!=0)
				{
					//use character class to convert char to uppercase
					char ch2 = Character.toUpperCase(ch[i]);
					System.out.println(ch2);
				}
			}

	}

}

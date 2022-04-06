package week3.Day1;

public class NumberOfOccurance {

	public static void main(String[] args) {
		// Check the number of occurrences of a char (eg 'e')in string
		
		String str="welcome to chennai";
		
		//Declare and initialize a variable count to store the number of occurrences
		
		int count =0;
		
		//Convert the string into char array
		
		char[] charArray = str.toCharArray();
		
		//get length of the array
		
		int length = str.length();
		
		//Traverse from 0 till the array length
		
		for (int i = 0; i <length; i++)
		{
			
			//Check the char array has the particular char in it
			
			if(charArray[i]=='e');
			
			//if it is increment the count
			
			count++;
			
			//Print the count out of the loop
			
			System.out.println(count);
		}
		
		
		
			
		}
		

}

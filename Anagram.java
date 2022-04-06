package week3.Day1;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) 
	{
		// First we need to declare the string
		
		String text1="stops";
		
		String text2="potss";
		
		//Check the length of the string same the (Use A Condition)
		
		int length1 = text1.length();
		
		System.out.println(length1);
		
		int length2 = text2.length();
		
		System.out.println(length2);
		
		if(length1==length2)
		{
			System.out.println("Length is equal");
			
		}
		else
		{
			System.out.println("Length is not equal");
		}
		
		// Convert both string is to character
		
		char[] charArray1 = text1.toCharArray();
		
		char[] charArray2 = text2.toCharArray();
		
		Arrays.sort(charArray1);
		
		Arrays.sort(charArray2);
		
		//Check both the arrays are same
		
		if (Arrays.equals(charArray1, charArray2)) 
		{
			System.out.println("ANAGRAM");
		}
		else
		{
			System.out.println("Not Anagram");
		}
	}

}

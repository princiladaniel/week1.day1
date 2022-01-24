package assignmentInString;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		 /*Declare a String 
		String text1 = "stops";*/
		String text1 = "stop";
		/*Declare another String
String text2 = "potss"; */
		String text2 = "post";
		boolean status =true;
		//a) Check length of the strings are same then (Use A Condition)
		if (text1.length() ==text2.length()) {
		status=false;	
		System.out.println("Same");
		}
		else { 
			System.out.println("not same");
		}
		//b) Convert both Strings in to characters
			char arr1[] = text1.toCharArray();
			char arr2[] = text2.toCharArray();
			
          //c) Sort Both the arrays
			Arrays.sort(arr1);
			Arrays.sort(arr2);
			System.out.println(arr1);
			System.out.println(arr2);
			
			//for (int i = 0; i < n1; i++)
	            //if (text1[i] != str2[i])
			
			//d) Check both the arrays has same value
			if (Arrays.equals(arr1, arr2))
				System.out.println("Anagram");
			else
				System.out.println("Not Anagram");

		}

	


	}



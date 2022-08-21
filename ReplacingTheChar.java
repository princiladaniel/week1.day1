package week1.day2;

public class ReplacingTheChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		


String sentence = "I am working with Java8";

String replaceString=sentence.replace('8','1');
String newSentence = replaceString+1;
System.out.println(newSentence);

char[] sentenceArray = newSentence.toCharArray();

System.out.println("*** Printing from position 5 to 14 ****" );

  for (int i = 5; i<=14; i++) 
  { 
	  System.out.print(sentenceArray[i]);
  }
	}
}
/*Write a Java program to replace a specified character with another character and add # to the given string.

String sentence = "I am working with Java8"
replace 8 to 11 
Print the characters from 5 to 14*/
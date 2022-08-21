package week1.day2;

public class LearnCompareString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 String str1=new String("I am Learning Java");
 String str2=new String("I am learning java?" );
 if (str1==str2) {
	 System.out.println("is equal");
 }
 else
	System.out.println("not equal");
	
	if (str1.equals(str2)) {
		 System.out.println("is equal");
	 }
	 else
		System.out.println("not equal");
	 
	if (str1.equalsIgnoreCase(str2)) {
		 System.out.println("is equal");
	 }
	 else
		System.out.println("not equal");
		}
}
/*Write a Java program to compare a given string to another string, ignoring case considerations.

String 1="I am Learning Java" 
String 2="I am learning java?   
**  Explore with == operator
**               equals
**               equalsignorecase  */                    
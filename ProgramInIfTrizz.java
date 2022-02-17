package week1;

public class ProgramInIfTrizz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=25;
if(sum %3==0 && sum %5==0) {
	System.out.println("TRIZZ-FIZZ");
}
if(sum%3==0) {
	System.out.println("TRIZZ");
}
else if(sum%5==0) {
		System.out.println("FIZZ");
	}

else 
	 System.out.println("number not divisible");
	}
}
//If t:he number is divisible by 3, print as TRIZZ
//If the number is divisible by 5, print as FIZZ
//If the number is divisible both by 3 and 5, print as TRIZZ-FIZZ
package week1;

public class Fibonacciseries {

	public static void main(String[] args) {
		// initialize 3 int variables (Tip: range = 8, firstNum = 0, secNum = 1, sum in the series)

		int range = 8, firstnum = 0, secnum = 1;
		// Print first number
		System.out.println(firstnum);
		// Iterate from 1 to the range
		for (int i = 1; i < range; i++) {
			// add first and second number assign to sum
			int sum = firstnum + secnum;
			// Assign second number to the first number
			firstnum = secnum;
			// Assign sum to the second number
			secnum = sum;
			// print sum
			System.out.println(firstnum);
		}
		

	}

}

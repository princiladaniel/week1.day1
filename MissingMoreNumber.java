package week1.day2;

import java.util.Arrays;

public class MissingMoreNumber {

	public static void main(String[] args) {
		int[] arr = {12, 6, 4, 2, 7, 5};
        int arrlength = arr.length;
        Arrays.sort(arr);

        int count = 1;
        for (int i = 0; i < arrlength-1; i++) {
            if (arr[i + 1] == arr[i] + 1) {
                continue;
            } else {
                for (int index = arr[i] + 1; index < arr[i + 1]; index++) {
                    System.out.println(index + " is missing element");
                }
            }
        }

	}

}

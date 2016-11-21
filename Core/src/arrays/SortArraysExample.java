package arrays;

import java.util.Arrays;
import java.util.Collections;

public class SortArraysExample {

	public static void main(String[] args) {

		// int array
		Integer[] intArray = new Integer[] { 14, 29, 8, -22, 15, 922 };

		// string aray
		String[] strArray = new String[] { "M", "P", "Q", "L", "F" };

		// sorting int array
		Arrays.sort(intArray, Collections.reverseOrder());

		for (Integer num : intArray) {
			System.out.println(num);
		}

	}

}

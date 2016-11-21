package io;

public class LineNumbersDemo {

	public static void main(String StringArray[]) {

		int min = 0;
		min = min(10, 20, min);
		System.out.println(min);
	}

	public static int min(int number1, int number2, int min) {
		if (number1 > number2)
			min = number1;
		else
			min = number2;

		return min;
	}

}

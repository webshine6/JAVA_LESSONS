package task16;

import java.util.Scanner;

public class Task16 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();

		int digit1 = (number / 100) % 10;
		int digit2 = (number / 10) % 10;
		int digit3 = number % 10;

		if (digit1 == digit2 && digit1 == digit3 && digit2 == digit3) {
			System.out.println("������� �� �����");
		} else if (digit1 > digit2 && digit2 > digit3) {
			System.out.println("������� �� � �������� ���");
		} else if (digit1 < digit2 && digit2 < digit3) {
			System.out.println("������� �� ��� �������� ���");
		} else {
			System.out.println("������� �� ����������");
		}

		scanner.close();

	}

}

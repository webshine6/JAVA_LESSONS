package lecture;

import java.util.Scanner;

public class ContinueLoop {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int number;

		do {
			System.out.print("������� + �����: ");
			number = scanner.nextInt();

		} while (number < 0);

		if (number % 2 == 0) {
			System.out.println("�����");
		} else {
			System.out.println("�������");
		}
		
		scanner.close();

	}

}

package task15;

import java.util.Scanner;

public class Task15 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("�������� ���������� ����� � ��������� [0...24]: ");
		int number = scanner.nextInt();

		if (number > 9 && number <= 18) {
			System.out.println("����� ���");
		} else if (number > 4 && number <= 9) {
			System.out.println("����� ����");
		} else {
			System.out.println("����� �����");
		}

		scanner.close();

	}

}

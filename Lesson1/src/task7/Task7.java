package task7;

import java.util.Scanner;

public class Task7 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int hour = scanner.nextInt();
		double money = scanner.nextDouble();
		boolean healthy = scanner.nextBoolean();

		if (!healthy) {
			System.out.println("���� �� �������.");

			if (money != 0) {
				System.out.println("�� �� ���� ���������.");
			} else {
				System.out.println("�� ���� ����� � �� ��� ���.");
			}
		} else {
			if (money < 10) {
				System.out.println("�� ����� �� ����.");
			} else {
				System.out.println("�� ������� � ��������.");
			}
		}

		scanner.close();

	}

}

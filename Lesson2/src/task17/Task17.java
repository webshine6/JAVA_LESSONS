package task17;

import java.util.Scanner;

public class Task17 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("�������� ����� b � ��������� [3...20]: ");
		int b = scanner.nextInt();

		System.out.print("�������� ����� ����: ");
		char c = scanner.next().charAt(0);

		if (b >= 3 && b <= 20) {
			for (int row = 1; row <= b; row++) {
				if (row == 1 || row == b) {
					for (int j = 1; j <= b; j++) {
						System.out.print("*");
					}
				} else {
					System.out.print("*");
					for (int i = 1; i < b - 1; i++) {
						System.out.print(c);
					}
					System.out.print("*");
				}
				System.out.println();
			}
			System.out.println();

		} else {
			System.out.println("��������� �������� �� b.");
		}

		scanner.close();
	}

}

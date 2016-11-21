package task21;

import java.util.Scanner;

public class Task21 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("�������� ����� � ��������� [1...51]: ");

		int input = scanner.nextInt();

		int num = 0;
		int pos = 0;

		if (input >= 1 && input <= 51) {
			// rows
			for (int row = 2; row < 15; row++) {

				for (int col = row, s = 1; col < row + 4 && s <= 4; col++, s++) {
					num = row; // �������
					int numberPos = ++pos;

					// check input
					if (numberPos >= input) {

						// check card height
						switch (num) {
						case 11:
							System.out.print("����");
							break;

						case 12:
							System.out.print("����");
							break;

						case 13:
							System.out.print("���");
							break;

						case 14:
							System.out.print("���");
							break;

						default:
							System.out.print(num);
							break;
						}

						// check card color
						switch (s) {
						case 1:
							System.out.print(" ������, ");
							break;

						case 2:
							System.out.print(" ����, ");
							break;

						case 3:
							System.out.print(" ����, ");
							break;

						case 4:
							System.out.print(" ����, ");
							break;

						default:
							break;
						}

					}
					// <---check input

				}

			}
		} else {
			System.out.println("��������� ������ �����.");
		}

		scanner.close();

	}

}

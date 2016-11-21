package task3;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String text1 = null;
		String text2 = null;

		// text1 validation
		do {
			System.out.print("�������� text1 :");
			text1 = sc.nextLine();
		} while (text1.isEmpty() || text1.contains(" "));

		// text2 validation
		do {
			System.out.print("�������� text1 :");
			text2 = sc.nextLine();
		} while (text2.isEmpty() || text2.contains(" "));

		if (text1.length() == text2.length()) {
			System.out.println("����� ���� �� � ����� �������.");
		} else {
			if (text1.length() > text2.length()) {
				System.out.println("������� ��� � ��-����� �� ������");
			} else {
				System.out.println("������ ��� � ��-����� �� ������");
			}
		}

		// ������������ �� ����� ������ ��-������� �� ������� �����
		String comparedStr = (text1.length() > text2.length()) ? text2 : text1;

		for (int i = 0; i < comparedStr.length(); i++) {
			if (text1.charAt(i) != text2.charAt(i)) {
				System.out.print((i + 1) + " " + text1.charAt(i) + "-" + text2.charAt(i));
			}
		}

		sc.close();

	}

}

package task8;

import java.util.Scanner;

/**
 * �� �� ������� ��������, ���� ����� �� ������� ��� �� ������� (������, ���).
 * ���������� �� ������ �� ������ ���� ��������� ������ � ���������, �.�. ����
 * ����� ������-������� � �������-������ � ���� � ���.
 * 
 * ����: ����� �����: ��.
 * 
 * ����: �������� �����: ��.
 * 
 * @author Ramona
 *
 */

public class Task8 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String input;

		do {
			System.out.print("���� �������� ����: ");
			input = sc.nextLine();
		} while (input.isEmpty());

		boolean isPalindrome = true;

		for (int i = 0; i < input.length() / 2; i++) {
			if (input.charAt(i) != input.charAt(input.length() - i - 1)) {
				isPalindrome = false;
				break;
			}
		}

		System.out.println(isPalindrome ? "���������" : "�� � ���������");

		sc.close();
	}

}

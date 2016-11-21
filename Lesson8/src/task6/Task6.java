package task6;

import java.util.Scanner;

/**
 * �� �� ������� ��������, ���� ����� �� ������� ��������� � ������� ����. ����
 * �������� �� ������ �� �� ������� ����� �����, �� ����� ������� ���� ��
 * ������� � ������ �����, � ���������� � ����� �� �� �����.
 * 
 * ������: ����� ����� ������
 * 
 * �����: ����� ����� ������
 * 
 * @author Ramona
 *
 */

public class Task6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String input;

		do {
			System.out.print("�������� ���������: ");
			input = sc.nextLine();
		} while (input.isEmpty());

		for (int i = 0; i < input.length(); i++) {
			if (i == 0 || input.charAt(i - 1) == ' ') {
				System.out.print(input.toUpperCase().charAt(i));
			} else {
				System.out.print(input.charAt(i));
			}
		}

		sc.close();
	}

}

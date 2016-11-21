package task5;

import java.util.Scanner;

/**
 * �� �� ������� ��������, ���� ����� �� �������� 2 ������ �� ����� (����). ���
 * � ����� ������ ������� ���� � ���� ����, �� �� ������ �� ������ �������
 * ������ ������������, � ������� ����������, ���� �� �� �� �������� � ����� ��
 * ����. ��� �������� ����� ��� ���� �� �� ������ ���� ������������ ���������.
 * 
 * ������:
 *  �
 *  �
 *  �����
 *  �
 *  �
 *  �
 * 
 * @author Ramona
 *
 */

public class Task5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String word1;
		String word2;

		// reading words
		do {
			System.out.print("�������� ������� ����: ");
			word1 = sc.nextLine().trim();
		} while (word1.isEmpty());

		do {
			System.out.print("�������� ������� ����: ");
			word2 = sc.nextLine().trim();
		} while (word2.isEmpty());

		boolean foundSameChar = false;
		int index = 0;

		for (int i = 0; i < word1.length(); i++) {
			if (word1.charAt(i) == word2.charAt(0)) {
				foundSameChar = true;
				index = i;
				break;
			}
		}

		// print words
		if (foundSameChar) {
			for (int i = 0; i < word1.length(); i++) {
				if (i != index) {
					System.out.println(word1.charAt(i));
				} else if (i == index) {
					System.out.println(word2);
				}

			}
		} else {
			System.out.println("�������� ����� ��� ����.");
		}

		sc.close();
	}

}

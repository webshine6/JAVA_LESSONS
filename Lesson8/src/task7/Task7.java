package task7;

import java.util.Scanner;

/**
 * �� �� ������� ��������, ����� ���� ����� �� ���� ��������� � ��������. ����
 * �������� �� �� �������� ���� �� ���������� ����, ����� � ���� ����� �
 * ���-������� ����.
 * 
 * ������: asd fg hjkl �����: 3 ����, ���-������� � � 4 �������
 * 
 * @author Ramona
 *
 */

public class Task7 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String input;

		do {
			System.out.print("���� �������� ����� �� ���� ��������� � ��������: ");
			input = sc.nextLine();
		} while (input.isEmpty());

		String[] words = input.split(" ");
		int counter = words.length;

		int maxLength = 0;
		String longestWord = null;

		int tempLength = 0;

		for (int i = 0; i < words.length; i++) {

			tempLength = words[i].length();

			if (tempLength > maxLength) {
				maxLength = tempLength;
				longestWord = words[i];
			}
		}

		System.out.println(counter + " ����. ���-������� � '" + longestWord + "' � " + maxLength + " �������.");

		sc.close();
	}

}

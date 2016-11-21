package task24;

import java.util.Scanner;

public class Task24 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("�������� ����� �� ��������� [10...30000]: ");

		// [10....30000]
		int num = scanner.nextInt();

		int temp;

		int digits = 0;

		int firstDigit = 0; // ����� �����

		int secondDigit = 0; // ����� �����
		int thirdDigit = 0; // ����� �����
		int fourthDigit = 0; // �������� �����

		int lastDigit = 0; // �������� �����

		boolean isPalindrome = true;

		int m = 0;
		int n = 0;
		int p = 0;

		if (num >= 10 && num <= 30000) {
			do {
				temp = num;
				temp = temp % 10;

				if (digits == 0) {
					lastDigit = temp; // 1
					m = lastDigit; // 1
				}

				if (digits == 1) {
					firstDigit = temp; // 7
					lastDigit = m; // 1
					m = firstDigit; // 7
				}

				if (digits == 2) {
					firstDigit = temp; // 6
					secondDigit = m; // 7
					m = firstDigit; // 6
				}

				if (digits == 3) {
					firstDigit = temp; // 4
					p = firstDigit; // 4
					n = secondDigit; // 7
					secondDigit = m;
					thirdDigit = n;
				}

				if (digits == 4) {
					firstDigit = temp;
					secondDigit = p;
					thirdDigit = m;
					fourthDigit = n;
				}

				digits++;

				num = num / 10;
			} while (num > 0);

			if (firstDigit != lastDigit) {
				isPalindrome = false;
			}

			if ((secondDigit != 0 && thirdDigit != 0) && digits % 2 == 0 && secondDigit != thirdDigit) {
				isPalindrome = false;
			}

			if ((secondDigit != 0 && fourthDigit != 0) && secondDigit != fourthDigit) {
				isPalindrome = false;
			}

			// print result
			if (isPalindrome) {
				System.out.println("������� e ���������.");
			} else {
				System.out.println("������� �� e ���������.");
			}
		} else {
			System.out.print("��������� ������ �����.");
		}

		/**
		 * System.out.println("�����: " + firstDigit);
		 * System.out.println("�����: " + secondDigit);
		 * System.out.println("�����: " + thirdDigit);
		 * System.out.println("��������: " + fourthDigit);
		 * System.out.println("��������: " + lastDigit);
		 **/
		scanner.close();
	}

}

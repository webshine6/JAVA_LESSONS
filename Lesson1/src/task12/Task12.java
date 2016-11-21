package task12;

import java.util.Scanner;

public class Task12 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("- ���: ");
		int dayNow = scanner.nextInt();

		System.out.print("- �����: ");
		int monthNow = scanner.nextInt();

		System.out.print("- ������: ");
		int yearNow = scanner.nextInt();

		int nextDay = dayNow;
		int nextMonth = monthNow;
		int nextYear = yearNow;

		boolean validInput = true;

		// �������� � ���������
		boolean isYearIntercalary = true;

		if (yearNow % 4 != 0 && yearNow % 400 != 0) {
			// �������� �� � ���������
			isYearIntercalary = false;
		}

		nextDay = ++dayNow;

		// 31 ��������
		if (nextDay == 31 && monthNow == 12) {
			nextDay = 1;
			nextMonth = 1;
			nextYear = ++yearNow;
		}

		if (monthNow == 1 || monthNow == 3 || monthNow == 5 || monthNow == 7 || monthNow == 8 || monthNow == 10
				|| monthNow == 12) {
			if (nextDay >= 33) {
				validInput = false;
				System.out.println("��������� ����.");
			}else if (nextDay == 32 ) {
				nextDay = 1;
				nextMonth = ++monthNow;
			} 

		} else if (monthNow == 4 || monthNow == 6 || monthNow == 9 || monthNow == 11) {
			if (nextDay >= 32) {
				validInput = false;
				System.out.println("��������� ����.");
			} else if (nextDay == 31) {
				nextDay = 1;
				nextMonth = ++monthNow;
			}

		}

		// ��������
		if (monthNow == 2) {
			if (nextDay >= 31) {
				validInput = false;
				System.out.println("��������� ����.");
			}if (nextDay == 30 && !isYearIntercalary) {
				validInput = false;
				System.out.println("��������� ����.");
			}

			if (nextDay == 30 && isYearIntercalary) { // �������� � ���������
				nextDay = 1;
				nextMonth = ++monthNow;
			}
		}

		scanner.close();

		if (validInput) {
			System.out.print("next day: ");
			System.out.println(nextDay + ", " + nextMonth + ", " + nextYear);
		}

	}

}

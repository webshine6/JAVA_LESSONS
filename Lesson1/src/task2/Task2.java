package task2;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("�������� ��� ����������� �����: ");
		System.out.print("numberInt1: ");
		int numberInt1 = scanner.nextInt();
		
		System.out.print("numberInt2: ");
		int numberInt2 = scanner.nextInt();
		
		System.out.println("�������� ��� ����� � ������� �������: ");
		System.out.print("numberDoubl1: ");
		double numberDoubl1 = scanner.nextDouble();
		
		System.out.print("numberDoubl2: ");
		double numberDoubl2 = scanner.nextDouble();
		
		int sum1 = numberInt1 + numberInt2;
		int distinction1 = numberInt1 - numberInt2;
		int production1 = numberInt1 * numberInt2;
		int reminder1 = numberInt1 % numberInt2;
		int intDivision1 = numberInt1 / numberInt2;
		
		System.out.println("����1 = " + sum1);
		System.out.println("�������1 = " + distinction1);
		System.out.println("������������1 = " + production1);
		System.out.println("������� �� �������1 = " + reminder1);
		System.out.println("����������� �������1 = " + intDivision1);
		
		double sum2 = numberDoubl1 + numberDoubl2;
		double distinction2 = numberDoubl1 - numberDoubl2;
		double production2 = numberDoubl1 * numberDoubl2;
		int reminder2 = (int) (numberDoubl1 % numberDoubl2);
		int intDivision2 = (int) (numberDoubl1 / numberDoubl2);
		
		System.out.println("����2 = " + sum2);
		System.out.println("�������2 = " + distinction2);
		System.out.println("������������2 = " + production2);
		System.out.println("������� �� �������2 = " + reminder2);
		System.out.println("����������� �������2 = " + intDivision2);
		
		scanner.close();		
		
	}
	
}

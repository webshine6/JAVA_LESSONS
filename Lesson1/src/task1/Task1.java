package task1;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		
		System.out.print("�������� �: " );
		double a = scanner.nextDouble();
		
		System.out.print("�������� B " );
		double b = scanner.nextDouble();
		
		System.out.print("�������� C: " );
		double c = scanner.nextDouble();
		
		// a < c < b
		if (a < c && c <b) {
			System.out.print("������� " + c + " � ����� " + a + " � " + b );
		}
		else {
			System.out.print("������� " + c + " �� � ����� " + a + " � " + b );
		}
		
		scanner.close();
		
	}

}

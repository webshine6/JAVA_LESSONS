package lecture;

import java.util.Scanner;

public class Coins {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int counter = 0;
		String coin = "";

		do {
			System.out.print("����, �������� ��� ��� ����?");
			coin = scanner.nextLine();

			if (coin.equals("���")) {
				counter++;
			} else {
				counter = 0;
			}

		} while (counter < 5 || !coin.equals("���") || !coin.equals("����"));

		System.out.println("--------- ���� ----------");

		scanner.close();
	}

}

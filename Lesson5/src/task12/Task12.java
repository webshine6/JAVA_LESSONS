package task12;

public class Task12 {

	public static void main(String[] args) {

		int[] arr = { 28, 14, 6, 5, 3, 8, -5 };

		// input2: 1, 2, 3, 4, 5, 6, 7

		for (int i = 0; i < arr.length; i++) {

			// ������� �� 0 � 1 ������� ���� ����� ����������
			int temp = arr[0];
			arr[0] = arr[1];
			arr[1] = temp;

			// ������� �� 2 � 3 ������� ���� ��������
			arr[2] = arr[2] - arr[3]; // 6 - 5 = 1
			arr[3] = arr[3] + arr[2]; // 5 + 1 = 6
			arr[2] = arr[3] - arr[2]; // 6 - 5 = 1

			// ������� �� 4 � 5 ������� ���� ���������
			arr[4] = arr[4] * arr[5]; // 3 * 8 = 24
			arr[5] = arr[4] / arr[5]; // 24 / 8 = 3
			arr[4] = arr[4] / arr[5]; // 24 / 3 = 8

		}

		// printing array
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}

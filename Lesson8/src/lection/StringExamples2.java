package lection;

public class StringExamples2 {

	public static void main(String[] args) {
		/**
		 * �������� ��� ���������:
		 * 
		 * ����������� �� ����������, �.�. immutable - ����� ������� �����
		 * �������, ���� �� ����������� �� ���a �������� � heap.
		 * 
		 * - String - ���������� ��� (����������� �� �� ���������� � heap-a) -
		 * ������ � ��������� �� �������� �� ����� ��� - charAt()
		 */

		String s1 = "��������������";

		String text = "�������������� � �������� �� �������";

		boolean index = text.contains(s1);

		StringBuilder sBuilder = new StringBuilder(text);

		sBuilder.insert(0, 28);
		sBuilder.insert(sBuilder.length(), "!"); // sBuilder.append("some
													// text");
		sBuilder.delete(0, 3);
		sBuilder.replace(10, 14, "additional str");
		sBuilder.append("� ��� �����");

		// ��������� �� ��������� �� ��� StringBuilder
		StringBuilder sb1 = new StringBuilder("��������������");
		StringBuilder sb2 = new StringBuilder("��������������");

		String textSb1 = sb1.toString();
		String textSb2 = sb2.toString();

		System.out.println("����� �� ��: " + textSb1.equals(textSb2));

		String test1 = new String("test");
		String test2 = new String("test");

		System.out.println(test1 == test2);

	}
}

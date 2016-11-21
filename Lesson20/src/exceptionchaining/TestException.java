package exceptionchaining;

import java.io.FileNotFoundException;
import java.io.IOException;

import javax.xml.bind.JAXBException;

public class TestException {

	public static void main(String[] args) {

		try {
			foo(); // ������ ����� �� ������ Exception ��� NullPointerException
			// ���� ������ �� � � throws �������� �� ������
			// ���� � throws �������� �� ������ �� � �������
			// NullPointerException,
			// �� � ���������� �� �� �������� � ����������
		} catch (IOException | JAXBException e) {
			e.printStackTrace();
		} catch (Exception e) {

			e.printStackTrace();
		}

		try {
			String s = null;
			// System.out.println(s.length());

			Object x = new Integer(25);
			System.out.println((String) x);

		} catch (NullPointerException ex) {
			System.out.println("NullPointerException is caught here");
			throw ex; // Re-throwing NullPointerException
		} catch (ClassCastException ce) {
			System.out.println("JVM unable to cast an object from one object to other type");
		}

	}

	public static void testException() throws FileNotFoundException, IOException { // �����������
																					// ��
		FileNotFoundException fnf = new FileNotFoundException(); // ���
		// ����������
		throw fnf;
		// �������
		// �������� ��
		// ���� ����
		// ����������
		// (�������
		// ���������
		// ��
		// ����������)
	}

	public static void go() throws IOException, JAXBException, FileNotFoundException {

	}

	public static void bar() {

	}

	public static void foo() throws IOException, JAXBException {

	}

}

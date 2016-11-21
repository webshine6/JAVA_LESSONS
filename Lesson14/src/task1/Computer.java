package task1;

public class Computer {

	int year; // ������� ��������, ������ �� ������������
	double price; // ���� �� ���������
	boolean isNotebook; // �������� ��� �� �������� ��������
	int hardDiskMemory; // ������ �� ��������
	int freeMemory; // ������ �� �������� �����
	String operationSystem; // ����������� �������

	void changeOperationSystem(String newOperationSystem) {
		if (newOperationSystem != null && !newOperationSystem.isEmpty()) {
			operationSystem = newOperationSystem;
		} else {
			System.out.println("Empty new operation system.");
		}
	}

	void useMemory(int memory) {
		if (memory <= freeMemory) {
			freeMemory -= memory;
		} else {
			System.out.println("Not enough free memory!");
		}
	}

}

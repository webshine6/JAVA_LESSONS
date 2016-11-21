package factory;

public class ComputerFactory {

	// ��������� �� �� input parameter �������� subclasses �� �������� � ������
	public static Computer getComputer(ComputerAbsractFactory factory) {
		return factory.createComputer();

	}

}

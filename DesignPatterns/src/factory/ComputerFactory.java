package factory;

public class ComputerFactory {

	// базирайки се на input parameter различни subclasses се създават и връщат
	public static Computer getComputer(ComputerAbsractFactory factory) {
		return factory.createComputer();

	}

}

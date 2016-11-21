package factory;

public class Test {
	public static void main(String args[]) {
		Computer pComputer = ComputerFactory.getComputer(new PCFactory("4 GB", "500 GB", "2.4GHz"));

		Computer sComputer = ComputerFactory.getComputer(new ServerFactory("16 GB", "1 TB", "3.65"));

		System.out.println("server config:: " + sComputer);
	}
}

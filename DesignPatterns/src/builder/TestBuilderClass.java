package builder;

public class TestBuilderClass {

	public static void main(String[] args) {
		Computer computer = new Computer.ComputerBuilder("500 GB", "2 GB").setBloothothEnabled(false)
				.setGraficsCardEnabled(true).build();
	}

}

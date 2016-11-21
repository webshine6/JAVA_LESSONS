package builder;

public class Computer {

	// required parameters
	private String hdd;
	private String ram;

	// optional parameters
	private boolean isGraficsCardEnabled;
	private boolean isBluethoothEnabled;

	public String getHDD() {
		return hdd;
	}

	public String getRAM() {
		return ram;
	}

	public boolean isGraficsCardEnabled() {
		return isGraficsCardEnabled;
	}

	public boolean isBluethoothEnabled() {
		return isBluethoothEnabled;
	}

	private Computer(ComputerBuilder builder) {
		this.hdd = builder.HDD;
		this.ram = builder.RAM;
		this.isGraficsCardEnabled = builder.isGraficsCardEnabled;
		this.isBluethoothEnabled = builder.isBluethoothEnabled;
	}

	// Builder class
	public static class ComputerBuilder {
		// required parameters
		private String HDD;
		private String RAM;

		// optional parameters
		private boolean isGraficsCardEnabled;
		private boolean isBluethoothEnabled;

		public ComputerBuilder(String hdd, String ram) {
			this.HDD = hdd;
			this.RAM = ram;
		}

		public ComputerBuilder setGraficsCardEnabled(boolean isGraficsCardEnabled) {
			this.isGraficsCardEnabled = isGraficsCardEnabled;
			return this;
		}

		public ComputerBuilder setBloothothEnabled(boolean isBluethoothEnabled) {
			this.isBluethoothEnabled = isBluethoothEnabled;
			return this;
		}

		public Computer build() {
			return new Computer(this);
		}

	}

}

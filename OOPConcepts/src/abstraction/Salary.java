package abstraction;

public class Salary extends Employee {

	private double salary;

	public Salary(String name, String address, int number, double salary) {
		super(name, address, number);
		setSelary(salary);
	}

	public void setSelary(double newSelary) {
		if (newSelary > salary) {
			salary = newSelary;
		}
	}

	public double getSelary() {
		return salary;
	}

	public void mailCheck() {
		System.out.println("Mail check of " + getName() + ", with selary: " + getSelary());
	}

	@Override
	public double computePay() {
		System.out.println("Computing salary pay for " + getName());
		return salary / 52;
	}

}

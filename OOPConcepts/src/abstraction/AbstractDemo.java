package abstraction;

public class AbstractDemo {

	public static void main(String[] args) {
		Salary salary = new Salary("Jordan", "Sofia", 2658, 14555);
		Employee employee = new Salary("Sonq", "Silistra", 8888232, 25662);

		System.out.println("Mailcheck using salary reference....");
		salary.mailCheck();

		System.out.println(employee.computePay());

	}

}

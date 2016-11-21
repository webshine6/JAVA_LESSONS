package association;

public class TransportCompany {

	public static void main(String[] args) {
		Car car = new Car("Ford", 180.15, 9988);
		Driver driver = new Driver("Andri", 25);

		// one to one relationship
		System.out.println(driver.getDriverName() + " is driver of car with ID:" + car.getCarId());

	}
}

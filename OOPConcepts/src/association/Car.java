package association;

public class Car {

	private String carName;

	private double carSpeed;

	private int carId;

	public Car(String carName, double carSpeed, int carId) {
		this.carName = carName;
		this.carSpeed = carSpeed;
		this.carId = carId;
	}

	public int getCarId() {
		return carId;
	}

}

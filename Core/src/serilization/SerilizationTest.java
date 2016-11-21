package serilization;

import java.io.IOException;

public class SerilizationTest {

	public static void main(String[] args) {

		Employee empObj = new Employee();
		empObj.setName("Kristina");
		empObj.setAddress("Razgrad");

		String fileName = "employee.ser";

		// serialize object to filename
		try {
			SerilizationUtil.serialize(empObj, fileName);
		} catch (IOException ioex) {
			ioex.printStackTrace();
			return;
		}

		// deserialize filename to object
		Employee emp = null;
		try {

			emp = (Employee) SerilizationUtil.deserialize(fileName);

		} catch (IOException ioex) {
			ioex.printStackTrace();
		} catch (ClassNotFoundException cnfex) {
			cnfex.printStackTrace();
		}

		System.out.println("Employee number: " + emp.ssl);

	}

}

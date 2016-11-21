package serilization;

import java.io.IOException;

public class ExternalizationTest {

	public static void main(String[] args) {
		Person person = new Person();

		person.setId(23);
		person.setName("Tom i Jerry");
		person.setGender("male");

		String fileName = "Person.ser";

		// serialize object to filename
		try {
			SerilizationUtil.serialize(person, fileName);
		} catch (IOException ioex) {
			ioex.printStackTrace();
			return;
		}

		// deserialize filename to object
		Person p = null;
		try {

			p = (Person) SerilizationUtil.deserialize(fileName);

		} catch (IOException ioex) {
			ioex.printStackTrace();
		} catch (ClassNotFoundException cnfex) {
			cnfex.printStackTrace();
		}

		System.out.println("Person: " + person);
		// System.out.println("Person gender: " + person.getGender());

	}

}

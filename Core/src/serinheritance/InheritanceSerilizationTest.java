package serinheritance;

import java.io.IOException;

import serilization.SerilizationUtil;

public class InheritanceSerilizationTest {

	public static void main(String[] args) {
		String fileName = "Subclass.ser";

		SubClass sClass = new SubClass();
		sClass.setId(15);
		sClass.setValue(2016);
		sClass.setName("");

		// serialize
		try {
			SerilizationUtil.serialize(sClass, fileName);
		} catch (IOException e) {
			e.printStackTrace();
			return;
		}

		// deserialize
		try {
			SubClass newSub = (SubClass) SerilizationUtil.deserialize(fileName);

			System.out.println("SubClass read: " + newSub);
		} catch (IOException ioex) {
			ioex.printStackTrace();
		} catch (ClassNotFoundException cnfex) {
			cnfex.printStackTrace();
		}

	}

}

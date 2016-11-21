package serilization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SendClass {

	public static void main(String[] args) {

		Address address = new Address("Tutrakan", "Sava Ognqnov", 26);
		Student studObj = new Student("Alesandur", 11, address, 175);

		Student studDes = null;

		try {
			File file = new File("Student.ser");
			FileOutputStream fos = new FileOutputStream(file);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(studObj);
			oos.close();
			fos.close();
			System.out.println("Serilization is done");

			FileInputStream fis = new FileInputStream(file);
			ObjectInputStream ois = new ObjectInputStream(fis);

			studDes = (Student) ois.readObject();

		} catch (IOException ioex) {
			ioex.printStackTrace();
		} catch (ClassNotFoundException cnfex) {
			System.out.println("Student class not found.");
			cnfex.printStackTrace();
		}

		System.out.println("Student name: " + studDes.getStudName());

	}

}

package serilization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerilizationUtil {

	// deserialize to Object from given file
	public static Object deserialize(String fileName) throws IOException, ClassNotFoundException {

		FileInputStream fileInput = new FileInputStream(fileName);
		ObjectInputStream in = new ObjectInputStream(fileInput);

		Object object = in.readObject();
		in.close();
		fileInput.close();
		return object;
	}

	// serialize object to given file
	public static void serialize(Object object, String fileName) throws IOException {

		FileOutputStream fileOut = new FileOutputStream(fileName);
		ObjectOutputStream out = new ObjectOutputStream(fileOut);

		out.writeObject(object);
		out.close();
		fileOut.close();
	}

}

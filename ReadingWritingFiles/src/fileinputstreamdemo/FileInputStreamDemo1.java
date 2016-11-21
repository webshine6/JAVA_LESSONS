package fileinputstreamdemo;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import java.text.SimpleDateFormat;

public class FileInputStreamDemo1 {

	public static void main(String[] args) {

		// FileInputStream is byte stream class
		String uri = "image-01.jpg";
		Path path = Paths.get(uri);

		BasicFileAttributes attr;

		File file = new File("image-01.jpg");

		try {
			attr = Files.readAttributes(path, BasicFileAttributes.class);

			FileTime dateTimeCreated = attr.creationTime();

			SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy H-mm-ss");
			String dateCreated = df.format(dateTimeCreated.toMillis());

			System.out.println("Creation date: " + dateCreated);

		} catch (Exception e) {
			System.out.println("Oops an error: " + e.getMessage());
		}

	}

}

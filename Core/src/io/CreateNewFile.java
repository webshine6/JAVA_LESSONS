package io;

import java.io.File;
import java.io.IOException;

public class CreateNewFile {

	public static void main(String[] args) throws IOException {

		File dir = new File("tmp");

		if (!dir.isDirectory()) {
			System.out.println("not a directory.Do nothing");
			return;
		}

		File[] files = dir.listFiles();
		for (File file : files) {
			System.out.println("Deleting " + file);
			file.delete();
		}

		System.out.println("Deleting directory. Success." + dir.delete());
	}

}

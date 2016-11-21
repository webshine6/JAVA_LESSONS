package objecttocsv;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class ObjectToCsv {

	private static final String CSV_SEPARATOR = ";";

	public static void writeToCsv(ArrayList<Product> productList) throws FileNotFoundException {

		try {
			// BufferedWriter bWriter = new BufferedWriter(
			// new OutputStreamWriter(new FileOutputStream("product.csv"),
			// "UTF-8"));

			FileWriter fr = new FileWriter("products.txt");
			BufferedWriter bWriter = new BufferedWriter(fr);

			for (Product product : productList) {
				StringBuffer line = new StringBuffer();
				line.append(product.getId() <= 0 ? "" : product.getId());
				line.append(CSV_SEPARATOR);

				line.append(product.getName().trim().length() == 0 ? "" : product.getName());
				line.append(CSV_SEPARATOR);

				line.append(product.getPrice() < 0 ? "" : product.getPrice());
				line.append(CSV_SEPARATOR);

				line.append(product.isVatApplicable() ? "Yes" : "No");

				bWriter.write(line.toString());
				bWriter.newLine();
			}

			bWriter.flush();
			bWriter.close();

		} catch (IOException ioex) {
			System.out.println("IOException " + ioex.getMessage());
		}
	}

}

package objecttocsv;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class MainApp {

	public static void main(String[] args) throws FileNotFoundException {

		ArrayList<Product> productList = new ArrayList<Product>();

		productList.add(new Product(2565, "car", 250.60, true));
		productList.add(new Product(4122, "book", 14.50, true));

		ObjectToCsv.writeToCsv(productList);
	}

}

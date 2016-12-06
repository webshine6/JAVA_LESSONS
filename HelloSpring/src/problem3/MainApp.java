package problem3;

import java.util.Locale;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) throws Exception {
		// specify multiple configuration files
		ApplicationContext context = new GenericXmlApplicationContext("Beans.xml");

		String alert = context.getMessage("alert.checkout", null, Locale.US);
		System.out.println(alert);

		/*
		 * Resource resource = new ClassPathResource("discount.properties");
		 * Properties properties =
		 * PropertiesLoaderUtils.loadProperties(resource);
		 * System.out.println("And dont forget our properties: ");
		 * System.out.println(properties);
		 */

	}

}

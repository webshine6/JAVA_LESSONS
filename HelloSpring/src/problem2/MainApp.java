package problem2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {

		ApplicationContext context = new GenericXmlApplicationContext("Beans.xml");

		Product battery = context.getBean("battery", Battery.class);
		Product disc = context.getBean("disc", Disc.class);

		System.out.println(battery);
		System.out.println(disc);

	}

}

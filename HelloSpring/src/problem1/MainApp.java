package problem1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {

		ApplicationContext context = new GenericXmlApplicationContext("Beans.xml");

		SequenceGenerator sGenerator = context.getBean("sequenceGenerator", SequenceGenerator.class);

		System.out.println(sGenerator.getSequence());
		System.out.println(sGenerator.getSequence());

	}

}

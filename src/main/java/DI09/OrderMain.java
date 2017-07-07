package DI09;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class OrderMain {
	public static void main(String[] args) {
		ApplicationContext context = new GenericXmlApplicationContext("di09.xml");
		OrderManager manager = context.getBean("orderManager", OrderManager.class);
		manager.order();
	}
}

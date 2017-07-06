package AOP01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class AOPMain {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext context = new GenericXmlApplicationContext("AOP01.xml");

		Person boy = context.getBean("boy", Person.class);
		boy.runSomething();

		Person girl = context.getBean("girl", Person.class);
		girl.runSomething();
	}
}

package AOP01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class AOPMain {
	public static void main(String[] args) {
		ApplicationContext context = new GenericXmlApplicationContext("NewFile.xml");
		Person boy = context.getBean("boy", Person.class);
		boy.runSomething();
	}
}

package Emp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class EmpMain {

	public static void main(String[] args) {
		ApplicationContext context = new GenericXmlApplicationContext("EmpTest.xml");
		Develope dev = context.getBean("develope", Develope.class);
		dev.work();
	}

}

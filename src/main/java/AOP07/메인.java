package AOP07;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class 메인 {
	public static void main(String[] args) {
		ApplicationContext context = new GenericXmlApplicationContext("AOP07.xml");
		사람 남자 = context.getBean("남",사람.class);
		
		남자.runSomething();
		남자.getAge(10,20);
	}
}

package basic;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class helloMain02 {
	public static void main(String[] args) {
		String xmlLocation = "classpath:beanContainer.xml";
//		ApplicationContext context = new ClassPathXmlApplicationContext("beanContainer.xml");
//		ApplicationContext context = new FileSystemXmlApplicationContext("src/main/resources/beanContainer.xml");
//		ApplicationContext context = new ClassPathXmlApplicationContext(xmlLocation);
		ApplicationContext context = new FileSystemXmlApplicationContext(xmlLocation);

		Hello obj1 = (Hello) context.getBean("hello1");
		obj1.printMsg();
		Hello obj2 = (Hello) context.getBean("hello2");
		//메모리에 대한 부하 때문에 서버가 실행되자마자 객체가 만들어지는 것이 아니라 필요할때 생성하도록 설정해줄 수 있다.(성능 관리)
		obj2.printMsg();
	}
}

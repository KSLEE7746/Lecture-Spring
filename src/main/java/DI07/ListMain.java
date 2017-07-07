package DI07;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class ListMain {
	public static void main(String[] args) {
		ApplicationContext context = new GenericXmlApplicationContext("DI08.xml");
		ListAddress list = context.getBean("list", ListAddress.class);
		List<String> address = list.getAddress();
		for(String addr : address){
			System.out.println(addr);
		}
	}
}

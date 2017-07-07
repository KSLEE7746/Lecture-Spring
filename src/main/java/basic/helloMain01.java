package basic;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

//개발자가 자기 코드에 객체를 생성하고 관리하는 방식
public class helloMain01 {
	public static void main(String[] args) {
		//class path는 src/main/resources 경로
		Resource resource = new ClassPathResource("beanContainer.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		
		Hello obj1 = (Hello) factory.getBean("hello1");
		obj1.printMsg();
		Hello obj2 = (Hello) factory.getBean("hello2");
		obj2.printMsg();
		
	}
}

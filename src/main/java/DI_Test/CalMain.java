package DI_Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CalMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 10, 2 두 숫자의 사칙 연산 결과를 출력하는 코드 작성(스프링 기반의 DI 방식을 적용)
		String xmlLocation = "classpath:cal_test.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(xmlLocation);
		//Calculator calculator = (Calculator) context.getBean("calculator");
		//Calculator cal = (Calculator) context.getBean("calculator");
		
		MyCalculator myCal = context.getBean("myCalculator", MyCalculator.class);
		myCal.add();
		myCal.sub();
	}

}

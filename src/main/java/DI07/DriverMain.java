package DI07;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
 * �������� �̿��� DI - @Autowired ������̼��� �̿��� ����
 *	- ����ڰ� ���μ��Ϳ��� �ڵ��� ����
 *  - ���μ��Ͱ� Ÿ�̾� �ֹ�
 *  - ���μ��Ϳ��� �ֹ��� Ÿ�̾ ������ �ڵ��� �ֹ�
 *  - ���μ��Ϳ��� Ÿ�̾ ������ �ڵ����� ��� 	
 *  
 *  <context:annotation-config/> �߰�
 */

public class DriverMain {
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("di07.xml");
		
		Car car = context.getBean("car", Car.class);
		System.out.println(car.getTireBrand());
	}
}









package DI06;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;

public class Car {
	
	@Resource(name="koreaTire")
	private Tire tire;
	
//	public Car() {
//		System.out.println("Car() �⺻������ ȣ��...");
//	}
//	
//	@Autowired
//	public Car(Tire tire) {
//		this.tire = tire;
//		System.out.println("Car(Tire) �Ű����� ������ ȣ��...");
//	}
//
//	@Autowired
//	public void setTire(Tire tire) {
//		this.tire = tire;
//		System.out.println("setTire() �޼ҵ� ȣ��...");
//	}
	
	public String getTireBrand() {
		return "타이어 종류 : " + tire.getBrand();
	}
}

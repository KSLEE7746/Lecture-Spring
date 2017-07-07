package DI07;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;

public class Car {
	
	@Resource
	private Tire tire;
	
	public Car() {
		System.out.println("Car() 생성자 실행...");
	}
	
	//@Autowired
	public Car(Tire tire) {
		this.tire = tire;
		System.out.println("Car(Tire) 생성자 타이어 주입...");
	}

	//@Autowired
	public void setTire(Tire tire) {
		this.tire = tire;
		System.out.println("setTire() setter 객체주입...");
	}
	
	public String getTireBrand() {
		return "타이어 종류 : " + tire.getBrand();
	}
}

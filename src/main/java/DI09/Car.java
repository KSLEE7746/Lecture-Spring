package DI09;

import org.springframework.stereotype.Component;

@Component
public class Car {
	private String name;
	public Car() {
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Car(String name) {
		super();
		this.name = name;
	}
	
	
}

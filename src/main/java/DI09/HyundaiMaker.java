package DI09;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service("hyundai")
public class HyundaiMaker implements CarMaker{
	@Autowired
	private Car car;
	
	@Override
	public void sell(Money money) {
		car.setName("제네시스");
		System.out.println(car.getName() + "를 " + money.getAmount() + "원에 팔았습니다.");
		
	}
}

package DI09;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class OrderManager {

	@Autowired
	@Qualifier("kia")
//	@Resource(name="hyundai")
	private CarMaker carMaker;
	
	@Autowired
	private Money money;
	
//	public OrderManager(CarMaker carMaker, Money money) {
//		this.carMaker = carMaker;
//		this.money = money;
//	}

	public void order() {
		money.setAmount(3000);
		carMaker.sell(money);
	}
}

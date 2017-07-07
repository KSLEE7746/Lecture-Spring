package DI09;

import org.springframework.stereotype.Component;

@Component
public class Money {
	private int amount;
	public Money(){
		
	}
	
	public Money(int amount){
		this.amount = amount;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}
	
}

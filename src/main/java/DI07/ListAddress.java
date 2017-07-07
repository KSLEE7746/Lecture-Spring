package DI07;

import java.util.List;

public class ListAddress {
	private List<String> address;

	
	public ListAddress() {
		// TODO Auto-generated constructor stub
	}
	public ListAddress(List<String> address) {
		this.address = address;
		System.out.println("ListAddress() 생성자 호출...");
	}
	public List<String> getAddress() {
		return address;
	}

	public void setAddress(List<String> address) {
		this.address = address;
		System.out.println("setAddress() 호출...");
	}

	
	
}

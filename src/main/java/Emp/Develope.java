package Emp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
@Service
public class Develope {
	@Autowired
	@Qualifier("developer")
	private Employee employee;
	
	public void work() {
		employee.gotoOffice();
		System.out.println("개발한다");
		employee.getOffOffice();
	}
}

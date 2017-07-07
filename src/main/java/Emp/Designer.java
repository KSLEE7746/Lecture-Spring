package Emp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component("designer")
public class Designer implements Employee {

	@Override
	public void gotoOffice() {
		// TODO Auto-generated method stub
		System.out.println("디자이너 출근했다.");
	}

	@Override
	public void getOffOffice() {
		// TODO Auto-generated method stub
		System.out.println("디자이너 퇴근했다.");
	}
	
}

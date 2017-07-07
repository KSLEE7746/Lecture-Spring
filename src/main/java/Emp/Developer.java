package Emp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component("developer")
public class Developer implements Employee {

	@Override
	public void gotoOffice() {
		// TODO Auto-generated method stub
		System.out.println("프로그래머 출근했다.");
	}
	@Override
	public void getOffOffice() {
		// TODO Auto-generated method stub
		System.out.println("프로그래머 퇴근했다.");
	}

}

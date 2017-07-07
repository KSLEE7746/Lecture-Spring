package AOPTEST;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class 메인 {
	public static void main(String[] args) {
		Scanner 스캐너 = new Scanner(System.in);
		시스템.출력("이름을 입력하세요 : ");
		String 이름 = 스캐너.nextLine();
		시스템.출력("나이를 입력하세요 : ");
		int 나이 = Integer.parseInt(스캐너.nextLine());
		
		ApplicationContext 콘텍스트 = new GenericXmlApplicationContext("AOPTEST.xml");
		
		사람 누구 = (사람)콘텍스트.getBean("남");
		누구.나이세팅(나이,이름);
		시스템.출력("=====================");
		누구.나이테스트(나이,이름);
	}
}

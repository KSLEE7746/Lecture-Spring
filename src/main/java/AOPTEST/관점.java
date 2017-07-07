package AOPTEST;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class 관점 {
	
	@Before("execution(* AOPTEST.*.*(..))")
	public void 미성년자검사(JoinPoint joinPoint){
		int 입력나이 = (Integer)joinPoint.getArgs()[0];
		String 이름 = (String)joinPoint.getArgs()[1];
		System.out.print(이름+"님은" + 입력나이+ "세이며, ");
		if(입력나이 < 20){
			System.out.println("미성년입니다.");
		}else{
			System.out.println("성년입니다.");
		}
	}
}

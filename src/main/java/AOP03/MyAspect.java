package AOP03;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;

public class MyAspect {
	
	public void before(JoinPoint joinpoint){
		System.out.println("싸운다.");
	}
}

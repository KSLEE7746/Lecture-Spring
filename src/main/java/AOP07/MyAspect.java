package AOP07;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class MyAspect {
	
	@Around("execution(* AOP07.*.runSomething())")
	public void around(ProceedingJoinPoint joinpoint) throws Throwable{
		System.out.println("열쇠로 문을 열고 집으로 들어온다.");
		joinpoint.proceed();
		System.out.println("문을 잠그고 밖으로 나간다.");
	}
	
	@Around("execution(Integer AOP07.*.getAge(..))")
	public void prnAge(ProceedingJoinPoint joinPoint) throws Throwable{
		Object[] obj = joinPoint.getArgs();
		obj[1] = (Integer)obj[1]+40;
		int age = (Integer)joinPoint.proceed(obj);
		System.out.println(age);
	}
}

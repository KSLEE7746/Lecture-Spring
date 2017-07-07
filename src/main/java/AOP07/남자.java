package AOP07;

public class 남자 implements 사람 {
	private int age = 40;
	
	@Override
	public void runSomething() {
		// TODO Auto-generated method stub
		System.out.println("남자");
	}

	@Override
	public Integer getAge(int a, int b){
		return age+a+b;
	}
}

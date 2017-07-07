package basic;

public class Hello {
	private String msg;
	public Hello() {
		System.out.println("Bean 생성");
		msg = "hello";
	}
	public void printMsg(){
		System.out.println("msg : " + msg);
	}
}

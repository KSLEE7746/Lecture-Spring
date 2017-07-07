package DI_Test;

public class MyCalculator {
	private int firstNum;
	private int secondNum;
	private Calculator calculator;
		
	public MyCalculator() {
		System.out.println("MyCalculator 생성");
	}
	
	public MyCalculator(int firstNum, int secondNum, Calculator calculator) {
		super();
		this.firstNum = firstNum;
		this.secondNum = secondNum;
		this.calculator = calculator;
	}

	public MyCalculator(int firstNum, int secondNum) {
		super();
		this.firstNum = firstNum;
		this.secondNum = secondNum;
	}
	public MyCalculator(Calculator calculator){
		this.calculator = calculator;
	}
	public void add(){
		System.out.println(calculator.addition(firstNum, secondNum));
	}
	public void sub(){
		System.out.println(calculator.subtract(firstNum, secondNum));
	}
	public void mul(){
		
	}
	public void div(){
		
	}
	public int getFirstNum() {
		return firstNum;
	}
	public void setFirstNum(int firstNum) {
		this.firstNum = firstNum;
	}
	public int getSecondNum() {
		return secondNum;
	}
	public void setSecondNum(int secondNum) {
		this.secondNum = secondNum;
	}
	public Calculator getCalculator() {
		return calculator;
	}
	public void setCalculator(Calculator calculator) {
		this.calculator = calculator;
	}
	
	
}

package AOPTEST;

public class 남자 implements 사람{
	private int 나이;
	private String 이름;

	@Override
	public void 나이세팅(int 나이, String 이름) {
		// TODO Auto-generated method stub
		this.나이 = 나이;
		this.이름 = 이름;
	}

	public void 나이테스트(int 나이, String 이름) {
		// TODO Auto-generated method stub
		this.나이 = 나이;
		this.이름 = 이름;
	}
}

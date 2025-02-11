package pack4extends;

public class Ex12Father extends Ex12GrandFa{
	private final int nai = 50;   // nai 수정 불가
	public String gabo = "청자 비슷한 물병";
	private int house = 1; 
	
	public Ex12Father() {
		super();   // 부모 생성자 호출
		System.out.println("아버지 생성자");
	}
	
	@Override    // annotation (뭔가를 처리하는 기능)
	public int getNai() {
		// 메소드 오버라이딩 : 부모와 똑같은 메소드르 자식에서 만듦. 내용은 대개 다르게 적겠지~
		int imsi = 0;  // 부모와 다른 코드를 적을 수 있다. 재정의.
		return nai;
	}
	
	@Override
	public void say() {
		String ss = "아버지 말씀 : 풀스택 개발자로 고~";
		System.out.println(ss);
	}
	
	public int getHouse() {
		return house;
	}
	
	public void showData() {
		String gabo = "맥북";
		System.out.println(gabo);
		System.out.println(this.gabo);
		System.out.println(super.gabo);
		
		say();
		this.say();
		super.say();
	}
}

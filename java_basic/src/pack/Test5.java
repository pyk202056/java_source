package pack;

import java.util.Scanner;

public class Test5 {
	public static void main(String[] args) {
		System.out.println("출발");
		//aa();  // aa 묶음(메소드)을 호출. 반환 값이 void일 때
		boolean bbb = aa();  //반환 값이 boolean일 때
		System.out.println(bbb);
		System.out.println("계속");
		
		System.out.println("\n논리 연산자 처리할 때 주의할 점 -------");
		boolean a = false, b = true, c;
		
		c = a || b;
		System.out.println("c는 " + c);
		c = a && b;
		System.out.println("c는 " + c);
		
		System.out.println("**********");
		c = abc() || def();
		System.out.println("묶음 수행 후 c는(or) " + c);
		c = def() || abc();
		System.out.println("묶음 수행 후 c는(or) " + c);
		
		System.out.println("~~~~~~~~~~~");
		c = abc() && def();
		System.out.println("보따리 수행 후 c는(and) " + c);
		c = def() && abc();
		System.out.println("보따리 수행 후 c는(and) " + c);
		
		System.out.println("~~모두 수행하기~~~~~~~~~");
		c = abc() | def();
		System.out.println("묶음 수행 후 c는(or) " + c);
		c = def() | abc();
		System.out.println("묶음 수행 후 c는(or) " + c);
		System.out.println();
		c = abc() & def();
		System.out.println("보따리 수행 후 c는(and) " + c);
		c = def() & abc();
		System.out.println("보따리 수행 후 c는(and) " + c);
		
		System.out.println("\n\n좀 다른 얘기를 실습 : 키보드(표준입력장치)로 값 받기");
		inputTest();
	}
	
	//public static void aa() {   // 독립적(반복적)으로 실행되는 코드를 별도의 묶음으로 작성
	public static boolean aa() {  // aa 처리 후 돌아갈때 boolean 값을 가지고 감. 반환값 
		System.out.println("아자");
		//System.out.println("아자2");
		return true;
	}
	
	public static boolean abc() {
		System.out.println("abc 출력, 한 줄 수행했지만 abc는 여러 행으로 구성된다고 가정");
		return true;
	}
	
	public static boolean def() {
		System.out.println("def 출력");
		return false;
	}
	
	public static void inputTest() {
		String ir = "손오공";
		int nai = 22;
		System.out.println(ir + "님의 나이는 " + nai);
		
		System.out.println();
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 입력:");
		String name = sc.next();
		System.out.print("나이 입력:");
		int age = sc.nextInt();
		System.out.println(name + "씨의 나이는 " + age);
	}
}

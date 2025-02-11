package pack2;

public class Ex4Exam2 {
	
	public Ex4Exam2() {
		// TODO Auto-generated constructor stub
	}
	
	public void printAge(String irum, int nai) {
		System.out.println("이름은 " + irum + " 나이는 " + nai);
	}
	
	public void printAge(String irum) {
		System.out.println("이름은 " + irum + " 나이는 알 수 없어요");
	}
	
	public void printAge() {
		System.out.println("이름과 나이는 알 수 없어요");
	}
	
	public static void main(String[] args) {
		Ex4Exam2 exam2 = new Ex4Exam2();
		exam2.printAge("김치국", 33);
		exam2.printAge("공기밥");
		exam2.printAge();
	}
}

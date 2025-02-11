package pack2;

public class Ex3Singer {
	private String name = "무명 가수";
	private String titleSong = "아 대한민국";
	
	public Ex3Singer(String name, String title) {
		// 생성자
		this.name = name;
		titleSong = title;
	}
	
	public void sing() {
		//String name = "아이유";  // 지역변수
		//System.out.println(name + "의 노래 제목은 " + titleSong);  // 아이유의 노래 제목은 아 대한민국
		System.out.println(this.name + "의 노래 제목은 " + titleSong);  // 무명 가수의 노래 제목은 아 대한민국
	}
	
	public void setTitleSong(String titleSong) { //setter
		this.titleSong = titleSong;
	}
	
	public static void main(String[] args) {
		Ex3Singer bts = new Ex3Singer("BTS", "다이너마이트");
		bts.sing();
		bts.setTitleSong("BTS 만세");
		bts.sing();
		bts.setTitleSong("BTS 화이팅");
		bts.sing();
		
		System.out.println();
		Ex3Singer blackpink = new Ex3Singer("블랙핑크", "how you like that");
		blackpink.sing();
	}
}

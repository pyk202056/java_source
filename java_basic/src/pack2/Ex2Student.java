package pack2;

public class Ex2Student {
    // 필드
    private String name;
    private int grade;
    private double score;

    // 생성자
//    public Ex2Student() {
//    	this.name = "신기해";  // 생성자 값을 주면 값이 고정됨
//    	grade = 2;
//    	score = 88.4;
//	}
    
    public Ex2Student(String name, int grade, double score) { // 매개변수는 지역변수
        this.name = name;  // 생성자를 호출하며 값을 줄 수 있다.
        this.grade = grade;
        this.score = score;
    }

    // 메서드
    public void printStudent() {
    	//String name = "하하";
        System.out.println("이름: " + name + ", 학년: " + grade + ", 평균 점수: " + score);
    }

    // setter를 이용해서 값을 줄 수도 있다.
    public void setScore(double score) {
    	this.score = score;
    }
    
    // main메소드는 프로그램을 실행하기 위한 메소드. Ex2Student 멤버는 아님~~~
    public static void main(String[] args) {
//    	Ex2Student friend1 = new Ex2Student();
//    	friend1.printStudent();
//    	
//    	Ex2Student friend2 = new Ex2Student();
//    	friend2.printStudent();
    	
    	Ex2Student tom = new Ex2Student("미스터톰", 3, 85.5);
    	tom.printStudent();
        System.out.println();
        Ex2Student james = new Ex2Student("제임스", 1, 95.5);
        james.printStudent();
        james.setScore(66.8);
        james.printStudent();
        james.setScore(90.0);
        james.printStudent();
    }
}
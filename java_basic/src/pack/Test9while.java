package pack;

import java.util.Scanner;

public class Test9while {
	public static void main(String[] args) {
		// 반복문 while : while(조건){ 반복 처리 대상... }
		int w = 1;
		
		while(w <= 5) {
			System.out.print("w : " + w + " ");
			w += 1;  // 조건이 거짓이 되는 명령문 필요
		}
		
		System.out.println("\n탈출 후 w : " + w);
		
		System.out.println();
		int count  = 0;
		while(count < 10) {   // while(10 > count)
			count++;      // ++count, count += 1,  count = count + 1  
			System.out.println("count:" + count);
			if(count == 10) {
				System.out.println("count가 10이라서 반복문 종료:" + count);
			}
		}
		
		System.out.println("다중 while -----");
		int a = 1;
		while(a <= 3) {
			System.out.println("a:" + a);
			int b = 1;
			while(b <= 4) {
				System.out.print("b=" + b + " ");
				b++;
			}
			a++;
			System.out.println();
		}
		
		System.out.println("do while -----");
		int m = 0;
		do {  // 최소 1회는 반드시 수행
			System.out.println("do while의 m:" + m);
			m++;
		}while(m <= 5);
		
		System.out.println("continue, break ----");
		int x = 0;
		while(x <= 10) {
			x = x + 1;
			if(x == 3) continue;
			if(x == 7) break;
			System.out.println("x:" + x);
		}
		
		System.out.println("무한 루프(looping)");
		int y = 1;
		while(true) {
			System.out.println("y:" + y);
			y++;
			if( y == 5) break;
		}
		
		
		System.out.println("문 : 1 ~ 10 사이의 정수 중 짝수만 출력하고 그 갯수도 출력");
		int su = 1;
		int hap = 0; // 건수 계산용
		while(su <= 10) {
			//System.out.println(su);
			if(su % 2 == 0) {
				System.out.println(su);
				hap += 1;
			}
			su++;
		}
		System.out.println("갯수는 " + hap);
		
		//System.exit(0);  // 참고 : 현재 실행 중인 프로그램 무조건 종료
		
		System.out.println("문 : 키보드로 정수를 입력받아 1부터 그 수까지의 합을 출력");
		// 조건 : 위 작업을 계속 반복할지 여부를 묻고 탈출 결정
		Scanner sc = new Scanner(System.in);
		
		while(true) {  // 무한 반복 (break를 만날 때까지)
			System.out.print("양의 정수를 입력:");
			int num = sc.nextInt();
			//System.out.println(num);
			if(num <= 1) {  // 1 이하의 값이 입력되면 작업 종료
				System.out.println("2 이상의 정수를 입력하세요");
				break;
			}
			// 1부터 해당 숫자까지의 합 출력
			int n=1, total = 0;
			while(n <= num) {  // 키보드에서 입력한 숫자 보다 작은 동안 반복
				total += n;
				n++;
			}
			System.out.println("합(total)은 " + total);
			
			System.out.print("계속할까요(1긍정/0부정)?");
			int imsi = sc.nextInt();
			if(imsi != 1) {  //! : 조건 부정
				System.out.println("\n작업 종료");
				break;
			}
		}
		
		sc.close();  // 참고 : 사용 중인 자원 해제
	}
}

package pack5;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class Ex38File1 {
	public static void main(String[] args) throws Exception{
		// 1바이트 단위의 입출력 
		System.out.print("1바이트 입력:");
		int a = System.in.read();   // 한글 등의 2바이트 문자는 입력 불가
		System.out.println("a : " + a + " " + (char)a);
		
		System.out.println("\n문자열 출력");
		OutputStreamWriter os = new OutputStreamWriter(System.out);
		//byte b = 97;
		//os.write(b);
		//os.flush();
		
		// 버퍼를 사용(파일 입출력(i/o) 성능을 향상, 처리 속도가 빨라짐)
		BufferedWriter bw = new BufferedWriter(os, 1024);  // 입출력은 기본이 1024byte(1Kb) 단위로 처리됨
		PrintWriter out = new PrintWriter(bw);
		out.println(123);
		out.println("문자열 출력");
		out.close();   // 자원 해제(메모리 반납, GC의 대상)
		bw.close();
		
		System.out.println("\n파일 단위의 출력");
		File f = new File("c:/work/iotest.txt");
		FileWriter fw = new FileWriter(f);
		BufferedWriter bw1 = new BufferedWriter(fw, 1024);
		PrintWriter out1 = new PrintWriter(bw1);
		out1.println(1234);
		out1.println("문자열이 파일로 출력됨");
		out1.println("행정안전부는 7일 오전 충북 충주시 북서쪽 22km 지역에서 규모 3.1의 지진 발생에 따라\\r\\n 중앙재난안전대책본부 회의를 개최하고, 현장상황 확인 및 상황관리를 위해 충주시에 현장상황관리관을 긴급 파견했다."
				+ "중대본 차장인 이한경 행안부 재난안전관리본부장은 이날 중대본 회의를 주재하고, 산업, 교통, 원전, 댐 등 주요 시설 피해 발생 여부를 점검하고 상황관리를 철저히 하라고 지시했다.");
		out1.close();
		bw1.close();
		fw.close();
	}

}

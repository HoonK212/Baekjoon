package baekjoon.step4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Q10952 {
	public static void main(String[] args) throws IOException {
		
		// IO 객체 선언과 동시에 초기화
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

		// 문자열을 구분자로 나누는 StringTokenizer 선언
		StringTokenizer st;
		
		// 연산을 위한 a, b, res 변수 생성
		int a = 0, b = 0, res = 0;
		
		do {
			// StringTokenizer 변수 초기화 (테스트 케이스 데이터 readLine())
			st = new StringTokenizer(in.readLine());
			
			// nextToken()를 활용하여 데이터 연산
			a = Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());
			res = a + b;
			
			// buffer에 res 값 저장
			if(res!=0) out.write(res + "\n");
		
		// 0 < A, B < 10 이므로 res 가 0이라면 입력의 마지막인 경우이니 제외한다.
		} while (res!=0);
		
		// buffer에 저장된 데이터 출력
		out.flush();
	}
}

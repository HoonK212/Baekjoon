package baekjoon.step3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Q15552 {
	public static void main(String[] args) throws IOException {
		
		// IO 객체 선언과 동시에 초기화
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

		// 문자열을 구분자로 나누는 StringTokenizer 선언
		StringTokenizer st;
		
		// 첫번째 데이터(테스트 케이스 개수) readLine()
		int t = Integer.parseInt(in.readLine()), a=0, b=0, res=0;
		
		// 테스트 케이스 개수만큼 반복
		for(int i=0; i<t; i++) {
			
			// StringTokenizer 변수 초기화 (테스트 케이스 데이터 readLine())
			st = new StringTokenizer(in.readLine());
			
			// nextToken()를 활용하여 데이터 연산
			a = Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());
			res = a + b;
			
			// buffer에 res 값 저장
			out.write(res + "\n");
		}
		
		// buffer에 저장된 데이터 출력
		out.flush();
	}
}
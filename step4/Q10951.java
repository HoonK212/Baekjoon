package step4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Q10951 {
	public static void main(String[] args) throws IOException {
		
		// IO 객체 선언과 동시에 초기화
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// in.readLine()의 값을 넣을 String 변수 생성
		String inputData = "";

		// 문자열을 구분자로 나누는 StringTokenizer 선언
		StringTokenizer st;

		// 연산을 위한 a, b, res 변수 생성
		int a = 0, b = 0, res = 0;
		
		// (inputData=in.readLine())가 null이라면 eof를 만난 경우이니 while문을 중단한다.
		while ((inputData=in.readLine()) != null) {
			
			// StringTokenizer 변수 초기화 (테스트 케이스 데이터 readLine())
			st = new StringTokenizer(inputData);

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

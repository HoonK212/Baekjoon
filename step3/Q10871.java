package baekjoon.step3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Q10871 {
	public static void main(String[] args) throws IOException {
		
		// IO 객체 선언과 동시에 초기화
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

		// 문자열을 구분자로 나누는 StringTokenizer 선언과 동시에 초기화 (n, x 데이터)
		StringTokenizer st = new StringTokenizer(in.readLine());
		int n = Integer.parseInt(st.nextToken());
		int x = Integer.parseInt(st.nextToken());
		
		// 수열 A readLine()
		st = new StringTokenizer(in.readLine());
		int y = 0;
		
		// n번 반복하며 x가 y(수열 A의 데이터)보다 큰 경우, buffer에 y 값 저장
		for(int i=0; i<n; i++) {
			
			y = Integer.parseInt(st.nextToken());
			
			if (x > y) {
				out.write(y + " ");
			}
		}
		
		// buffer에 저장된 데이터 출력
		out.flush();
	}
}
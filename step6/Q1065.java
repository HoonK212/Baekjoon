package baekjoon.step6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1065 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print(arithmetic_sequence(Integer.parseInt(br.readLine())));
	}
 
	// arithmetic sequence(등차수열) 연산 함수
	public static int arithmetic_sequence(int num) {

		// 한수의 개수를 카운트하는 변수 생성
		int cnt = 0;
 
		// num이 10의 자리 숫자인 경우, num을 return
		if (num < 100) {
			return num;
		} else {
			cnt = 99;
			
			if (num == 1000) {
				// num이 1000인 경우, 예외 처리
				num = 999;
			}
 
			for (int i = 100; i <= num; i++) {
				int hun = i / 100; // 100의 자리 수
				int ten = (i / 10) % 10; // 10의 자리 수
				int one = i % 10; // 1의 자리 수
 
				// 각 자리 숫자가 등차수열을 이룬 경우
				if ((hun - ten) == (ten - one)) {
					cnt++;
				}
			}
		}
 
		return cnt;
	}
		
}

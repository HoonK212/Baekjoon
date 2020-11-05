package baekjoon.step4;

import java.util.Scanner;

public class Q1110 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// 0보다 크거나 같고, 99보다 작거나 같은 정수 n & 연산의 결과값을 담을 res & 반복 횟수를 기록할 i 변수 생성
		int n = sc.nextInt(), res = n, i = 0;

		// n과 res의 일치여부를 기준으로 반복
		//	최초에 n과 res는 동일하므로 do - while문 사용
		do {
			
			// 주어진 정수가 일의 자리 숫자인지 십의 자리 숫자인지 구분
			if (res < 10) {
				
				// 주어진 정수가 일의 자리 숫자라면
				//	-> 11을 곱하면 해당 연산과 같다.
				res = 11 * res;
			} else {
				
				// 주어진 정수가 십의 자리 숫자라면
				//	1. 일의 자리 숫자에 10을 곱한다.
				//	2. 십의 자리 숫자와 일의자리 숫자를 더한 후, 해당 숫자의 일의 자리 숫자를 구한다.
				//	3. 1번과 2번 연산의 결과값을 서로 더한다.
				res = (res%10) * 10 + (res/10 + res%10) % 10;
			}
			
			// 연산 횟수 계산
			i++;
		
		} while (n!=res);
		
		System.out.println(i);
		
	}
}

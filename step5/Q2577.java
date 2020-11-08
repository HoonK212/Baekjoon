package baekjoon.step5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q2577 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		// 자연수 A, B, C를 곱한 결과값을 res 변수에 담는다.
		int res = 1;
		for (int i=0; i<3; i++) {
			res *= Integer.parseInt(in.readLine());
		}
		
		// charAt() 메소드를 활용하기 위해 valueOf() 메소드로 int -> String 형변환
		String strRes = String.valueOf(res);
		int len = strRes.length();
		
		// 출력값을 담을 배열 생성
		int[] arr =  new int[10];
		
		// 0부터 9까지의 숫자가 몇 번 쓰였는지 연산
		for (int i=0; i<len; i++) {
			arr[strRes.charAt(i)-'0']++;
		}
		
		// 한 줄에 하나씩 출력
		for (int i=0; i<10; i++) {
			System.out.println(arr[i]);
		}
	}
}
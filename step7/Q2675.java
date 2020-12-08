package baekjoon.step7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2675 {
	public static void main(String[] args) throws IOException {
	    
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
        
		// 테스트 케이스의 개수 T
		int t = Integer.parseInt(in.readLine());
		
		// 문자를 반복할 횟수 R
		int r;
 
		for (int i = 0; i < t; i++) {
 
			// str[0] -> 반복할 횟수 R, str[1] -> 반복할 문자열 S
			String[] str = in.readLine().split(" ");
			r = Integer.parseInt(str[0]);
 
			// getBytes() 메소드를 활용하여 문자열을 byte 배열로 변환한다.
			for (byte val : str[1].getBytes()) {
				for (int j = 0; j < r; j++) {
					sb.append((char)val);
				}
			}
			
			// 각 테스트 케이스마다 개행
			sb.append('\n');
		}
		
		System.out.print(sb);
	}
}
package baekjoon.step7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q5622 {
	public static void main(String[] args) throws IOException {
	    
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String str = in.readLine();
		int len = str.length();
		
		// 주어진 알파벳에 따른 시간 계산을 위한 변수 생성
		int cnt = 0;
        
		for(int i = 0; i < len; i++) {
        
			switch(str.charAt(i)) {
			
				// 'A', 'B', 'C'가 숫자 '2'에 해당하지만, 숫자 '1'이 2초의 시간이 소요되므로 3초로 계산
				case 'A' : case 'B': case 'C' : 
					cnt += 3; 
					break;
	                
				case 'D' : case 'E': case 'F' : 
					cnt += 4; 
					break;
	                
				case 'G' : case 'H': case 'I' : 
					cnt += 5; 
					break;
	                
				case 'J' : case 'K': case 'L' : 
					cnt += 6; 
					break;
	                
				case 'M' : case 'N': case 'O' : 
					cnt += 7; 
					break;
	                
				case 'P' : case 'Q': case 'R' : case 'S' :
					cnt += 8; 
					break;
	                
				case 'T' : case 'U': case 'V' : 
					cnt += 9; 
					break;
	                
				case 'W' : case 'X': case 'Y' : case 'Z' : 
					cnt += 10; 
					break;
			}
		}		
		
		// 다이얼을 걸기 위한 최소 시간 출력
		System.out.print(cnt);
	}
}
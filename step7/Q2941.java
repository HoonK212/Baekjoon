package baekjoon.step7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2941 {
	public static void main(String[] args) throws IOException {
	    
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String str = in.readLine();
		int len = str.length();
		char ch;
		
		// 주어진 단어가 몇 개의 크로아티아 알파벳으로 이루어져 있는지 계산하기 위한 변수 생성
		int cnt = 0;
		
		for (int i = 0; i < len; i++) {
 
			ch = str.charAt(i);
			
			// charAt(i)의 값이 'c'인 경우
			if(ch == 'c' && i < len-1) {
				
				// charAt(i+1)의 값이 '=' 또는 '-'인 경우
				if(str.charAt(i+1) == '=' || str.charAt(i+1) == '-') {		
					// charAt(i+1)까지 고려했으므로 i++로 한 단계 생략
					i++;		
				}
				
			// charAt(i)의 값이 'd'인 경우
			} else if(ch == 'd' && i < len-1) {
				
				// charAt(i+1)의 값이 '-'인 경우
				if(str.charAt(i+1) == '-') {
						i++;
						
				// charAt(i+i)의 값이 'z'인 경우
				} else if(str.charAt(i+1) == 'z' && i < len-2) {
					// charAt(i+i)의 값이 'z'이면서 charAt(i+2)의 값이 '='인 경우
					if(str.charAt(i+2) == '=') {
						i += 2;
					}
				}
				
			// charAt(i)의 값이 'l' 또는 'n'인 경우
			} else if((ch == 'l' || ch == 'n') && i < len-1) {
				
				// charAt(i+1)의 값이 'j'인 경우
				if(str.charAt(i+1) == 'j') {
					i++;
				}
				
			// charAt(i)의 값이 's' 또는 'z'인 경우
			} else if((ch == 's' || ch == 'z') && i < len-1) {
				
				// charAt(i+1)의 값이 '='인 경우
				if(str.charAt(i+1) == '=') {
					i++;
				}
		    }
		    
			cnt++;
		}
 
		System.out.println(cnt);
	}
}
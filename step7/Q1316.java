package baekjoon.step7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1316 {
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	 
	public static void main(String[] args) throws IOException {
 
		// 그룹 단어의 개수를 계산하기 위한 변수 생성
		int cnt = 0;
		
		// 단어의 개수 n
		int n = Integer.parseInt(in.readLine());
 
		// check() 메소드를 활용하여 cnt 계산
		for (int i = 0; i < n; i++) {
			if (check()) {
				cnt++;
			}
		}
		
		// 결과값 출력
		System.out.print(cnt);
	}
 
	public static boolean check() throws IOException {
		
		// 단어의 연속성을 체크할 boolean 배열 생성
		boolean[] check = new boolean[26];
		
		// 포인터로 사용할 int 변수 prev, now 생성
		int prev = 0;
		int now;
		
		// readLine()을 활용하여 주어진 단어로 String 변수 생성
		String str = in.readLine();
		int len = str.length();
		
		// str의 길이만큼 반복하며 연속성 체크
		for(int i = 0; i < len; i++) {
			
			// now 포인터의 값을 str의 i번째 문자로 초기화
			now = str.charAt(i);
			
			// i번째 문자가 바로 앞의 문자와 같지 않은 경우
			if (prev != now) {
				
				// i번째 문자가 str에서 사용된 적이 없는 경우
				if (!check[now - 'a']) {
					
					// i번째 문자에 해당하는 배열의 값을 true로 초기화
					check[now - 'a'] = true;
					
					// 다음 계산을 위해 prev 포인터의 값을 now 포인터의 값으로 초기화
					prev = now;	
					
				} else {
					
					// i번째 문자가 str에서 이미 사용된 경우 -> 그룹 단어가 아님
					return false;
					
				}
			}
		}
		
		// 그룹 단어인 경우 true 리턴
		return true;
	}
}
package baekjoon.step5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q8958 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		// 테스트 케이스의 개수를 담을 변수 생성
		int n = Integer.parseInt(in.readLine());

		// 각 테스트 케이스를 readLine()할 String 변수 생성
		String str = "";
		
		// 'str의 길이', '각 테스트 케이스의 점수', '연속된 O의 개수'를 담을 int 변수 생성
		int len = 0, sum = 0, score = 1;
		
		// 2중 for문으로 각 테스트 케이스마다
		//	해당 문제까지 연속된 0의 개수를 각 문제의 점수로 하여 점수를 구한다.
		for(int i=0; i<n; i++) {

			// str, len, sum, score 초기화
			str = in.readLine();
            len = str.length();
            sum = 0;
            score = 1;

            for(int j=0; j<len; j++) {
            	
                if(str.charAt(j) == 'O') {
                	
                	// charAt()으로 'O'를 찾은 경우
                	//	해당 문제의 점수를 sum에 더한 후, 그 다음 문제의 점수를 미리 1점 올려 놓는다.
                    sum += score;
                    score++;
                    
                } else {

                	// charAt()으로 'O'을 찾지 못한 경우
                	//	'O'의 연속성이 깨졌으므로, 그 다음 문제의 점수를 1점으로 초기화 한다.
                	score = 1;
                }
            }
            
            // 출력 데이터 작성
            sb.append(sum + "\n");
        }
 
        System.out.print(sb);
		
	}
}
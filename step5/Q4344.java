package step5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q4344 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		StringBuilder sb = new StringBuilder();
		
		// 테스트 케이스의 개수를 담을 변수 생성
		int c = Integer.parseInt(in.readLine());
		
		// '학생 수', '학생들의 점수 합', '평균을 넘는 학생들의 수'를 담을 변수 생성
		int n, sum, over;
		
		// 학생들의 점수를 담을 배열 변수 생성
		int[] arr;
		
		// 학생들의 점수 평균값을 담을 변수 생성
		double avg;
		
		// 출력 데이터를 담을 변수 생성
		String res;
		
		for (int i=0; i<c; i++) {
			
			// '학생들의 점수 합', '평균을 넘는 학생들의 수'를 담을 변수 초기화
			sum = 0;
			over = 0;
			
			// 각 테스트 케이스의 학생 수(n)에 맞게 점수를 담을 배열 변수 초기화
			st = new StringTokenizer(in.readLine());
			n = Integer.parseInt(st.nextToken());
			arr = new int[n];
			
			// 학생들의 점수를 배열에 넣고 그 합을 연산한다.
			for(int j=0; j<n; j++) {
				arr[j] = Integer.parseInt(st.nextToken());
				sum += arr[j];
			}
			
			// 학생들의 점수 평균값 연산
			avg = sum / (double) n;
			
			// 평균을 넘는 학생들의 수 계산
			for(int j=0; j<n; j++) {
				if(arr[j]>avg) {
					over++;
				}
			}
			
			// 각 케이스마다 한 줄씩,
			//	비율을 반올림하여 소수점 셋째 자리까지 출력하도록
			//	데이터를 StringBuilder에 담는다.
			res = String.format("%.3f", over / (double) n * 100 );
			sb.append(res + "%\n");
		}
 
        System.out.print(sb);
	}
}
package step5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q1546 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		// 시험 본 과목의 개수를 담을 변수 생성
		int n = Integer.parseInt(in.readLine());
		
		// N개 과목의 시험 성적을 담을 배열 생성
		int[] arr = new int[n];
		
		// N개 과목의 시험 성적 데이터 readLine()
		StringTokenizer st = new StringTokenizer(in.readLine());
		
		// N개 과목의 시험 성적 합산을 담을 변수 생성
		int sum = 0;
		
		for(int i=0; i<n; i++) {
			
			// nextToken()을 활용하여 각 과목의 시험 성적을 배열에 담는다.
			arr[i] = Integer.parseInt(st.nextToken());
			
			// N개 과목의 시험 성적 함산을 구한다.
			sum += arr[i];
		}
		
		// 시험 성적을 오름차순으로 정렬한다.
		Arrays.sort(arr);
		
		// 출력 데이터를 연산한다.
		System.out.println(sum * 100 / (double) (n * arr[n-1]));
	}
}
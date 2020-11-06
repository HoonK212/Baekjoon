package baekjoon.step5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q10818 {
	public static void main(String[] args) throws IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		// 정수의 개수 N 값을 담을 변수 len 생성
		int len = Integer.parseInt(in.readLine());
		
		// len 의 크기를 가지는 배열 arr 생성
		int[] arr = new int[len];
		
		// 문자열을 구분자로 나누는 StringTokenizer 객체를 readLine()메소드를 활용하여 생성
		StringTokenizer st = new StringTokenizer(in.readLine());
		
		// N개의 정수를 배열 arr에 담기 위해 for문 사용
		for (int i=0; i<len; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		// 배열 arr을 오름차순으로 정렬
		Arrays.sort(arr);
		
		// 최소값 arr[0]과 최대값 arr[len-1]을 출력
		System.out.println(arr[0] + " " + arr[len-1]);
	}
}
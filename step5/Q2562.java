package baekjoon.step5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q2562 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		// 9개의 서로 다른 자연수를 담을 배열 arr1, arr2 생성
		int[] arr1 = new int[9];
		int[] arr2 = new int[9];
		
		// readLine()으로 데이터를 읽어, 배열 arr1과 arr2에 동일한 값을 넣는다.
		for (int i=0; i<9; i++) {
			arr1[i] = Integer.parseInt(in.readLine());
			arr2[i] = arr1[i];
		}
		
		// arr2를 오름차순으로 정렬
		Arrays.sort(arr2);
		
		// 원본 배열인 arr1과 오름차순으로 정렬된 배열인 arr2를 비교하여, 최대값(arr2[8])과 최댓값이 몇 번째 수(res)인지를 출력한다.
		int res = 0;
		for (int i=0; i<9; i++) {
			if(arr1[i] == arr2[8]) {
				res = i+1;
				break;
			}
		}
		System.out.println(arr2[8] + "\n" + res);
	}
}
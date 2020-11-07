package baekjoon.step5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q2562 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		// 9���� ���� �ٸ� �ڿ����� ���� �迭 arr1, arr2 ����
		int[] arr1 = new int[9];
		int[] arr2 = new int[9];
		
		// readLine()���� �����͸� �о�, �迭 arr1�� arr2�� ������ ���� �ִ´�.
		for (int i=0; i<9; i++) {
			arr1[i] = Integer.parseInt(in.readLine());
			arr2[i] = arr1[i];
		}
		
		// arr2�� ������������ ����
		Arrays.sort(arr2);
		
		// ���� �迭�� arr1�� ������������ ���ĵ� �迭�� arr2�� ���Ͽ�, �ִ밪(arr2[8])�� �ִ��� �� ��° ��(res)������ ����Ѵ�.
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
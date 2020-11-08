package baekjoon.step5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q2577 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		// �ڿ��� A, B, C�� ���� ������� res ������ ��´�.
		int res = 1;
		for (int i=0; i<3; i++) {
			res *= Integer.parseInt(in.readLine());
		}
		
		// charAt() �޼ҵ带 Ȱ���ϱ� ���� valueOf() �޼ҵ�� int -> String ����ȯ
		String strRes = String.valueOf(res);
		int len = strRes.length();
		
		// ��°��� ���� �迭 ����
		int[] arr =  new int[10];
		
		// 0���� 9������ ���ڰ� �� �� �������� ����
		for (int i=0; i<len; i++) {
			arr[strRes.charAt(i)-'0']++;
		}
		
		// �� �ٿ� �ϳ��� ���
		for (int i=0; i<10; i++) {
			System.out.println(arr[i]);
		}
	}
}
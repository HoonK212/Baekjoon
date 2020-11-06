package baekjoon.step5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q10818 {
	public static void main(String[] args) throws IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		// ������ ���� N ���� ���� ���� len ����
		int len = Integer.parseInt(in.readLine());
		
		// len �� ũ�⸦ ������ �迭 arr ����
		int[] arr = new int[len];
		
		// ���ڿ��� �����ڷ� ������ StringTokenizer ��ü�� readLine()�޼ҵ带 Ȱ���Ͽ� ����
		StringTokenizer st = new StringTokenizer(in.readLine());
		
		// N���� ������ �迭 arr�� ��� ���� for�� ���
		for (int i=0; i<len; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		// �迭 arr�� ������������ ����
		Arrays.sort(arr);
		
		// �ּҰ� arr[0]�� �ִ밪 arr[len-1]�� ���
		System.out.println(arr[0] + " " + arr[len-1]);
	}
}
package step5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q1546 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		// ���� �� ������ ������ ���� ���� ����
		int n = Integer.parseInt(in.readLine());
		
		// N�� ������ ���� ������ ���� �迭 ����
		int[] arr = new int[n];
		
		// N�� ������ ���� ���� ������ readLine()
		StringTokenizer st = new StringTokenizer(in.readLine());
		
		// N�� ������ ���� ���� �ջ��� ���� ���� ����
		int sum = 0;
		
		for(int i=0; i<n; i++) {
			
			// nextToken()�� Ȱ���Ͽ� �� ������ ���� ������ �迭�� ��´�.
			arr[i] = Integer.parseInt(st.nextToken());
			
			// N�� ������ ���� ���� �Ի��� ���Ѵ�.
			sum += arr[i];
		}
		
		// ���� ������ ������������ �����Ѵ�.
		Arrays.sort(arr);
		
		// ��� �����͸� �����Ѵ�.
		System.out.println(sum * 100 / (double) (n * arr[n-1]));
	}
}
package step5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q3052 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		// ���� ���(42�� ���� ������ ��)�� ���� �迭 ����
		int[] arr = new int[10];
		
		// �����͸� ���� ���ϱ� ���� ù��° ���� �̸� ��´�.
		arr[0] = Integer.parseInt(in.readLine())%42;
		
		// ��� �����͸� ����ϱ� ���� int ���� ����
		int res = 0;
		
		// 2�� for������ 2��° ������ 10��° ������ ���� ���(42�� ���� ������ ��)�� �����鼭
		//	���� ������ �����Ͱ� �̹� �迭�� �����ϴ� ���� ���, res++�� �����Ѵ�.
		for (int i=1; i<10; i++) {
			arr[i] = Integer.parseInt(in.readLine())%42;

			for(int j=0; j<i; j++) {
				if(arr[i] == arr[j]) {
					res++;
					break;
				}
			}
		}
		
		// 10���� res�� ���� ���� ��� ������(���� �ٸ� �������� �� �� �ִ���)�� �����Ѵ�.
		System.out.println(10-res);
	}
}
package baekjoon.step4;

import java.util.Scanner;

public class Q1110 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// 0���� ũ�ų� ����, 99���� �۰ų� ���� ���� n & ������ ������� ���� res & �ݺ� Ƚ���� ����� i ���� ����
		int n = sc.nextInt(), res = n, i = 0;

		// n�� res�� ��ġ���θ� �������� �ݺ�
		//	���ʿ� n�� res�� �����ϹǷ� do - while�� ���
		do {
			
			// �־��� ������ ���� �ڸ� �������� ���� �ڸ� �������� ����
			if (res < 10) {
				
				// �־��� ������ ���� �ڸ� ���ڶ��
				//	-> 11�� ���ϸ� �ش� ����� ����.
				res = 11 * res;
			} else {
				
				// �־��� ������ ���� �ڸ� ���ڶ��
				//	1. ���� �ڸ� ���ڿ� 10�� ���Ѵ�.
				//	2. ���� �ڸ� ���ڿ� �����ڸ� ���ڸ� ���� ��, �ش� ������ ���� �ڸ� ���ڸ� ���Ѵ�.
				//	3. 1���� 2�� ������ ������� ���� ���Ѵ�.
				res = (res%10) * 10 + (res/10 + res%10) % 10;
			}
			
			// ���� Ƚ�� ���
			i++;
		
		} while (n!=res);
		
		System.out.println(i);
		
	}
}

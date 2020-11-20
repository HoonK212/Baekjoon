package baekjoon.step6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1065 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print(arithmetic_sequence(Integer.parseInt(br.readLine())));
	}
 
	// arithmetic sequence(��������) ���� �Լ�
	public static int arithmetic_sequence(int num) {

		// �Ѽ��� ������ ī��Ʈ�ϴ� ���� ����
		int cnt = 0;
 
		// num�� 10�� �ڸ� ������ ���, num�� return
		if (num < 100) {
			return num;
		} else {
			cnt = 99;
			
			if (num == 1000) {
				// num�� 1000�� ���, ���� ó��
				num = 999;
			}
 
			for (int i = 100; i <= num; i++) {
				int hun = i / 100; // 100�� �ڸ� ��
				int ten = (i / 10) % 10; // 10�� �ڸ� ��
				int one = i % 10; // 1�� �ڸ� ��
 
				// �� �ڸ� ���ڰ� ���������� �̷� ���
				if ((hun - ten) == (ten - one)) {
					cnt++;
				}
			}
		}
 
		return cnt;
	}
		
}

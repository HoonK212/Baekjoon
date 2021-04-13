package step5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q4344 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		StringBuilder sb = new StringBuilder();
		
		// �׽�Ʈ ���̽��� ������ ���� ���� ����
		int c = Integer.parseInt(in.readLine());
		
		// '�л� ��', '�л����� ���� ��', '����� �Ѵ� �л����� ��'�� ���� ���� ����
		int n, sum, over;
		
		// �л����� ������ ���� �迭 ���� ����
		int[] arr;
		
		// �л����� ���� ��հ��� ���� ���� ����
		double avg;
		
		// ��� �����͸� ���� ���� ����
		String res;
		
		for (int i=0; i<c; i++) {
			
			// '�л����� ���� ��', '����� �Ѵ� �л����� ��'�� ���� ���� �ʱ�ȭ
			sum = 0;
			over = 0;
			
			// �� �׽�Ʈ ���̽��� �л� ��(n)�� �°� ������ ���� �迭 ���� �ʱ�ȭ
			st = new StringTokenizer(in.readLine());
			n = Integer.parseInt(st.nextToken());
			arr = new int[n];
			
			// �л����� ������ �迭�� �ְ� �� ���� �����Ѵ�.
			for(int j=0; j<n; j++) {
				arr[j] = Integer.parseInt(st.nextToken());
				sum += arr[j];
			}
			
			// �л����� ���� ��հ� ����
			avg = sum / (double) n;
			
			// ����� �Ѵ� �л����� �� ���
			for(int j=0; j<n; j++) {
				if(arr[j]>avg) {
					over++;
				}
			}
			
			// �� ���̽����� �� �پ�,
			//	������ �ݿø��Ͽ� �Ҽ��� ��° �ڸ����� ����ϵ���
			//	�����͸� StringBuilder�� ��´�.
			res = String.format("%.3f", over / (double) n * 100 );
			sb.append(res + "%\n");
		}
 
        System.out.print(sb);
	}
}
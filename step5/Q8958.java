package baekjoon.step5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q8958 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		// �׽�Ʈ ���̽��� ������ ���� ���� ����
		int n = Integer.parseInt(in.readLine());

		// �� �׽�Ʈ ���̽��� readLine()�� String ���� ����
		String str = "";
		
		// 'str�� ����', '�� �׽�Ʈ ���̽��� ����', '���ӵ� O�� ����'�� ���� int ���� ����
		int len = 0, sum = 0, score = 1;
		
		// 2�� for������ �� �׽�Ʈ ���̽�����
		//	�ش� �������� ���ӵ� 0�� ������ �� ������ ������ �Ͽ� ������ ���Ѵ�.
		for(int i=0; i<n; i++) {

			// str, len, sum, score �ʱ�ȭ
			str = in.readLine();
            len = str.length();
            sum = 0;
            score = 1;

            for(int j=0; j<len; j++) {
            	
                if(str.charAt(j) == 'O') {
                	
                	// charAt()���� 'O'�� ã�� ���
                	//	�ش� ������ ������ sum�� ���� ��, �� ���� ������ ������ �̸� 1�� �÷� ���´�.
                    sum += score;
                    score++;
                    
                } else {

                	// charAt()���� 'O'�� ã�� ���� ���
                	//	'O'�� ���Ӽ��� �������Ƿ�, �� ���� ������ ������ 1������ �ʱ�ȭ �Ѵ�.
                	score = 1;
                }
            }
            
            // ��� ������ �ۼ�
            sb.append(sum + "\n");
        }
 
        System.out.print(sb);
		
	}
}
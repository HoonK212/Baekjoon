package baekjoon.step3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Q15552 {
	public static void main(String[] args) throws IOException {
		
		// IO ��ü ����� ���ÿ� �ʱ�ȭ
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

		// ���ڿ��� �����ڷ� ������ StringTokenizer ����
		StringTokenizer st;
		
		// ù��° ������(�׽�Ʈ ���̽� ����) readLine()
		int t = Integer.parseInt(in.readLine()), a=0, b=0, res=0;
		
		// �׽�Ʈ ���̽� ������ŭ �ݺ�
		for(int i=0; i<t; i++) {
			
			// StringTokenizer ���� �ʱ�ȭ (�׽�Ʈ ���̽� ������ readLine())
			st = new StringTokenizer(in.readLine());
			
			// nextToken()�� Ȱ���Ͽ� ������ ����
			a = Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());
			res = a + b;
			
			// buffer�� res �� ����
			out.write(res + "\n");
		}
		
		// buffer�� ����� ������ ���
		out.flush();
	}
}
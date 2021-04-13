package step4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Q10952 {
	public static void main(String[] args) throws IOException {
		
		// IO ��ü ����� ���ÿ� �ʱ�ȭ
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

		// ���ڿ��� �����ڷ� ������ StringTokenizer ����
		StringTokenizer st;
		
		// ������ ���� a, b, res ���� ����
		int a = 0, b = 0, res = -1;
		
		// 0 < A, B < 10 �̹Ƿ� res �� 0�̶�� �Է��� �������� ����̴� while���� �ߴ��Ѵ�.
		while (res!=0) {
			// StringTokenizer ���� �ʱ�ȭ (�׽�Ʈ ���̽� ������ readLine())
			st = new StringTokenizer(in.readLine());
			
			// nextToken()�� Ȱ���Ͽ� ������ ����
			a = Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());
			res = a + b;
			
			// buffer�� res �� ���� (�Է��� �������� ��쿡 �������� ����)
			if(res!=0) out.write(res + "\n");
		}
		
		// buffer�� ����� ������ ���
		out.flush();
	}
}

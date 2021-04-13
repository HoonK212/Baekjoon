package step4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Q10951 {
	public static void main(String[] args) throws IOException {
		
		// IO ��ü ����� ���ÿ� �ʱ�ȭ
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// in.readLine()�� ���� ���� String ���� ����
		String inputData = "";

		// ���ڿ��� �����ڷ� ������ StringTokenizer ����
		StringTokenizer st;

		// ������ ���� a, b, res ���� ����
		int a = 0, b = 0, res = 0;
		
		// (inputData=in.readLine())�� null�̶�� eof�� ���� ����̴� while���� �ߴ��Ѵ�.
		while ((inputData=in.readLine()) != null) {
			
			// StringTokenizer ���� �ʱ�ȭ (�׽�Ʈ ���̽� ������ readLine())
			st = new StringTokenizer(inputData);

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

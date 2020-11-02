package baekjoon.step3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Q10871 {
	public static void main(String[] args) throws IOException {
		
		// IO ��ü ����� ���ÿ� �ʱ�ȭ
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

		// ���ڿ��� �����ڷ� ������ StringTokenizer ����� ���ÿ� �ʱ�ȭ (n, x ������)
		StringTokenizer st = new StringTokenizer(in.readLine());
		int n = Integer.parseInt(st.nextToken());
		int x = Integer.parseInt(st.nextToken());
		
		// ���� A readLine()
		st = new StringTokenizer(in.readLine());
		int y = 0;
		
		// n�� �ݺ��ϸ� x�� y(���� A�� ������)���� ū ���, buffer�� y �� ����
		for(int i=0; i<n; i++) {
			
			y = Integer.parseInt(st.nextToken());
			
			if (x > y) {
				out.write(y + " ");
			}
		}
		
		// buffer�� ����� ������ ���
		out.flush();
	}
}
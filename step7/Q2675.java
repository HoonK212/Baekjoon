package baekjoon.step7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2675 {
	public static void main(String[] args) throws IOException {
	    
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
        
		// �׽�Ʈ ���̽��� ���� T
		int t = Integer.parseInt(in.readLine());
		
		// ���ڸ� �ݺ��� Ƚ�� R
		int r;
 
		for (int i = 0; i < t; i++) {
 
			// str[0] -> �ݺ��� Ƚ�� R, str[1] -> �ݺ��� ���ڿ� S
			String[] str = in.readLine().split(" ");
			r = Integer.parseInt(str[0]);
 
			// getBytes() �޼ҵ带 Ȱ���Ͽ� ���ڿ��� byte �迭�� ��ȯ�Ѵ�.
			for (byte val : str[1].getBytes()) {
				for (int j = 0; j < r; j++) {
					sb.append((char)val);
				}
			}
			
			// �� �׽�Ʈ ���̽����� ����
			sb.append('\n');
		}
		
		System.out.print(sb);
	}
}
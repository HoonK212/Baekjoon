package baekjoon.step7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1316 {
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	 
	public static void main(String[] args) throws IOException {
 
		// �׷� �ܾ��� ������ ����ϱ� ���� ���� ����
		int cnt = 0;
		
		// �ܾ��� ���� n
		int n = Integer.parseInt(in.readLine());
 
		// check() �޼ҵ带 Ȱ���Ͽ� cnt ���
		for (int i = 0; i < n; i++) {
			if (check()) {
				cnt++;
			}
		}
		
		// ����� ���
		System.out.print(cnt);
	}
 
	public static boolean check() throws IOException {
		
		// �ܾ��� ���Ӽ��� üũ�� boolean �迭 ����
		boolean[] check = new boolean[26];
		
		// �����ͷ� ����� int ���� prev, now ����
		int prev = 0;
		int now;
		
		// readLine()�� Ȱ���Ͽ� �־��� �ܾ�� String ���� ����
		String str = in.readLine();
		int len = str.length();
		
		// str�� ���̸�ŭ �ݺ��ϸ� ���Ӽ� üũ
		for(int i = 0; i < len; i++) {
			
			// now �������� ���� str�� i��° ���ڷ� �ʱ�ȭ
			now = str.charAt(i);
			
			// i��° ���ڰ� �ٷ� ���� ���ڿ� ���� ���� ���
			if (prev != now) {
				
				// i��° ���ڰ� str���� ���� ���� ���� ���
				if (!check[now - 'a']) {
					
					// i��° ���ڿ� �ش��ϴ� �迭�� ���� true�� �ʱ�ȭ
					check[now - 'a'] = true;
					
					// ���� ����� ���� prev �������� ���� now �������� ������ �ʱ�ȭ
					prev = now;	
					
				} else {
					
					// i��° ���ڰ� str���� �̹� ���� ��� -> �׷� �ܾ �ƴ�
					return false;
					
				}
			}
		}
		
		// �׷� �ܾ��� ��� true ����
		return true;
	}
}
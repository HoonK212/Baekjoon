package baekjoon.step7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2941 {
	public static void main(String[] args) throws IOException {
	    
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String str = in.readLine();
		int len = str.length();
		char ch;
		
		// �־��� �ܾ �� ���� ũ�ξ�Ƽ�� ���ĺ����� �̷���� �ִ��� ����ϱ� ���� ���� ����
		int cnt = 0;
		
		for (int i = 0; i < len; i++) {
 
			ch = str.charAt(i);
			
			// charAt(i)�� ���� 'c'�� ���
			if(ch == 'c' && i < len-1) {
				
				// charAt(i+1)�� ���� '=' �Ǵ� '-'�� ���
				if(str.charAt(i+1) == '=' || str.charAt(i+1) == '-') {		
					// charAt(i+1)���� ��������Ƿ� i++�� �� �ܰ� ����
					i++;		
				}
				
			// charAt(i)�� ���� 'd'�� ���
			} else if(ch == 'd' && i < len-1) {
				
				// charAt(i+1)�� ���� '-'�� ���
				if(str.charAt(i+1) == '-') {
						i++;
						
				// charAt(i+i)�� ���� 'z'�� ���
				} else if(str.charAt(i+1) == 'z' && i < len-2) {
					// charAt(i+i)�� ���� 'z'�̸鼭 charAt(i+2)�� ���� '='�� ���
					if(str.charAt(i+2) == '=') {
						i += 2;
					}
				}
				
			// charAt(i)�� ���� 'l' �Ǵ� 'n'�� ���
			} else if((ch == 'l' || ch == 'n') && i < len-1) {
				
				// charAt(i+1)�� ���� 'j'�� ���
				if(str.charAt(i+1) == 'j') {
					i++;
				}
				
			// charAt(i)�� ���� 's' �Ǵ� 'z'�� ���
			} else if((ch == 's' || ch == 'z') && i < len-1) {
				
				// charAt(i+1)�� ���� '='�� ���
				if(str.charAt(i+1) == '=') {
					i++;
				}
		    }
		    
			cnt++;
		}
 
		System.out.println(cnt);
	}
}
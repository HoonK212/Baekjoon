package baekjoon.step7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q5622 {
	public static void main(String[] args) throws IOException {
	    
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String str = in.readLine();
		int len = str.length();
		
		// �־��� ���ĺ��� ���� �ð� ����� ���� ���� ����
		int cnt = 0;
        
		for(int i = 0; i < len; i++) {
        
			switch(str.charAt(i)) {
			
				// 'A', 'B', 'C'�� ���� '2'�� �ش�������, ���� '1'�� 2���� �ð��� �ҿ�ǹǷ� 3�ʷ� ���
				case 'A' : case 'B': case 'C' : 
					cnt += 3; 
					break;
	                
				case 'D' : case 'E': case 'F' : 
					cnt += 4; 
					break;
	                
				case 'G' : case 'H': case 'I' : 
					cnt += 5; 
					break;
	                
				case 'J' : case 'K': case 'L' : 
					cnt += 6; 
					break;
	                
				case 'M' : case 'N': case 'O' : 
					cnt += 7; 
					break;
	                
				case 'P' : case 'Q': case 'R' : case 'S' :
					cnt += 8; 
					break;
	                
				case 'T' : case 'U': case 'V' : 
					cnt += 9; 
					break;
	                
				case 'W' : case 'X': case 'Y' : case 'Z' : 
					cnt += 10; 
					break;
			}
		}		
		
		// ���̾��� �ɱ� ���� �ּ� �ð� ���
		System.out.print(cnt);
	}
}
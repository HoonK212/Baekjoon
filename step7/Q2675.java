package baekjoon.step7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2675 {
	public static void main(String[] args) throws IOException {
	    
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
        
		int t = Integer.parseInt(in.readLine());  
		int r;
 
		for (int i = 0; i < t; i++) {
 
			String[] str = in.readLine().split(" ");
 
			r = Integer.parseInt(str[0]);
 
			for (byte val : str[1].getBytes()) {
				for (int j = 0; j < r; j++) {
					sb.append((char)val);
				}
			}
			
			sb.append('\n');
		}
		
		System.out.print(sb);
	}
}
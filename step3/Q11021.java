package baekjoon.step3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Q11021 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st;
		
		int t = Integer.parseInt(in.readLine()), a=0, b=0, res=0;
		
		for(int i=0; i<t; i++) {
			
			st = new StringTokenizer(in.readLine());
			
			a = Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());
			res = a + b;
			
			out.write("Case #" + (i+1) +": " +  res + "\n");
		}
		
		out.flush();
	}
}
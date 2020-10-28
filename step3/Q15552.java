package baekjoon.step3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q15552 {
	public static void main(String[] args) {
		
		BufferedReader in = null;
		BufferedWriter out = null;
		int t=0, a=0, b=0;
		
		in = new BufferedReader(new InputStreamReader(System.in));
		out = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			t = in.read();
			for(int i=0; i<t; i++) {
				a = in.read();
				b = in.read();
				out.write(a+b);
			}
			out.flush();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(out!=null) out.close();
				if(in!=null) in.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
}

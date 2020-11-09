package baekjoon.step5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q3052 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int[] arr = new int[10];
		arr[0] = Integer.parseInt(in.readLine())%42;
		int res = 1;
		
		for (int i=1; i<10; i++) {
			arr[i] = Integer.parseInt(in.readLine())%42;

			for(int j=0; j<i; j++) {
				if(arr[i] == arr[j]) {
					res++;
					break;
				}
			}
		}
		
		System.out.println(res+1);
	}
}
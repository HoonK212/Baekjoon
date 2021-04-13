package step2;

import java.util.Scanner;

public class Q2884 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int H = sc.nextInt();
		int M = sc.nextInt();
		
		if(H>=1) {
			if(M>=45) {
				System.out.println(H + " " + (M-45));
			} else {
				System.out.println((H-1) + " " + (M+15));
			}
		} else {
			if(M>=45) {
				System.out.println(H + " " + (M-45));
			} else {
				System.out.println((H+23) + " " + (M+15));
			}
		}
		
	}
}

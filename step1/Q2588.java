package baekjoon.step1;

import java.util.Scanner;

public class Q2588 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A, B;
		A = sc.nextInt();
		B = sc.nextInt();
		System.out.println(A*(B%10));
		System.out.println(A*(B%100-B%10)/10);
		System.out.println(A*(B-B%100)/100);
		System.out.println(A*B);
	}
}

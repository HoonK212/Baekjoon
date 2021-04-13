package step7;

import java.util.Scanner;

public class Q11720 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// 숫자의 개수 N을 담을 변수 생성
		int n = sc.nextInt();
		sc.nextLine();
		
		// charAt()을 활용하기 위해 N개의 숫자 전체를 문자열 변수로 생성 
		String str = sc.nextLine();
		
		int res = 0;
		for(int i=0; i<n; i++) {
			// charAt(index)를 활용하여 숫자 N개의 합 구하기
			res += str.charAt(i)-48;
		}
		
		// 결과값 출력
		System.out.println(res);
	}
}

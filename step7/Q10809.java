package step7;

import java.util.Scanner;

public class Q10809 {
	public static void main(String[] args) {
		
		// 단어를 입력받아 String 변수로 생성
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
 
		// int 배열을 생성하여 각각의 알파벳이 단어에 포함되어 있지 않은 경우부터 완성
		int[] arr = new int[26];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = -1;
		}
 
		// 각 알파벳의 위치를 for문의 i값을 활용하여 초기화
		char ch;
		for(int i = 0; i < str.length(); i++) {
			ch = str.charAt(i);
    
			if(arr[ch - 'a'] == -1) {
				arr[ch - 'a'] = i;
			}
		}
 
		// for each문으로 결과값 출력
		for(int res : arr) {
			System.out.print(res + " ");
		}
	}
}
package step7;

import java.util.Scanner;

public class Q10809 {
	public static void main(String[] args) {
		
		// �ܾ �Է¹޾� String ������ ����
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
 
		// int �迭�� �����Ͽ� ������ ���ĺ��� �ܾ ���ԵǾ� ���� ���� ������ �ϼ�
		int[] arr = new int[26];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = -1;
		}
 
		// �� ���ĺ��� ��ġ�� for���� i���� Ȱ���Ͽ� �ʱ�ȭ
		char ch;
		for(int i = 0; i < str.length(); i++) {
			ch = str.charAt(i);
    
			if(arr[ch - 'a'] == -1) {
				arr[ch - 'a'] = i;
			}
		}
 
		// for each������ ����� ���
		for(int res : arr) {
			System.out.print(res + " ");
		}
	}
}
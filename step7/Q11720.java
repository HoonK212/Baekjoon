package step7;

import java.util.Scanner;

public class Q11720 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// ������ ���� N�� ���� ���� ����
		int n = sc.nextInt();
		sc.nextLine();
		
		// charAt()�� Ȱ���ϱ� ���� N���� ���� ��ü�� ���ڿ� ������ ���� 
		String str = sc.nextLine();
		
		int res = 0;
		for(int i=0; i<n; i++) {
			// charAt(index)�� Ȱ���Ͽ� ���� N���� �� ���ϱ�
			res += str.charAt(i)-48;
		}
		
		// ����� ���
		System.out.println(res);
	}
}

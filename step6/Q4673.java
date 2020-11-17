package baekjoon.step6;

public class Q4673 {
	public static void main(String[] args) {

		// �����ڰ� �����ϴ��� üũ�� boolean �迭 flag ����
		boolean[] flag = new boolean[10000];

		for (int i = 0; i < 10000; i++){
			
			// 1���� 10000���� d(n) �Լ��� �������� ���� n���� ����
			int n = d(i+1);
			
			// n�� 10000 ���϶��, flag�� n-1��° �ε����� true�� �ʱ�ȭ
			if(n < 10001){
				flag[n-1] = true;
			}
		}

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < 10000; i++) {
			
			// flag ���� true�� �ε����� �������� i+1�� ���
			if (!flag[i]) {
				sb.append(i+1).append('\n');
			}
		}
		
		System.out.println(sb);
	}

	// ���� ���� n�� ���ؼ� d(n)�� n�� n�� �� �ڸ����� ���ϴ� �Լ�
	static int d(int n){
		
		int sum = n;
		
		while(n != 0){
			sum += (n % 10);
			n = n/10;
		}
		
		return sum;
	}
}

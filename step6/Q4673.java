package baekjoon.step6;

public class Q4673 {
	public static void main(String[] args) {

		boolean[] flag = new boolean[10000];

		for (int i = 0; i < 10000; i++){
			
			int n = d(i+1);
			
			if(n < 10001){
				flag[n-1] = true;
			}
		}

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < 10000; i++) {
			
			if (!flag[i]) {
				sb.append(i+1).append('\n');
			}
		}
		
		System.out.println(sb);
	}

	static int d(int number){
		
		int sum = number;
		
		while(number != 0){
			sum += (number % 10);
			number = number/10;
		}
		
		return sum;
	}
}

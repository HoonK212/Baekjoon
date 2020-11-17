package baekjoon.step6;

public class Q4673 {
	public static void main(String[] args) {

		// 생성자가 존재하는지 체크할 boolean 배열 flag 생성
		boolean[] flag = new boolean[10000];

		for (int i = 0; i < 10000; i++){
			
			// 1부터 10000까지 d(n) 함수의 연산결과를 변수 n으로 생성
			int n = d(i+1);
			
			// n이 10000 이하라면, flag의 n-1번째 인덱스를 true로 초기화
			if(n < 10001){
				flag[n-1] = true;
			}
		}

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < 10000; i++) {
			
			// flag 값이 true인 인덱스를 기준으로 i+1을 출력
			if (!flag[i]) {
				sb.append(i+1).append('\n');
			}
		}
		
		System.out.println(sb);
	}

	// 양의 정수 n에 대해서 d(n)을 n과 n의 각 자리수를 더하는 함수
	static int d(int n){
		
		int sum = n;
		
		while(n != 0){
			sum += (n % 10);
			n = n/10;
		}
		
		return sum;
	}
}

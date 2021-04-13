package step5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q3052 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		// 연산 결과(42로 나눈 나머지 값)를 담을 배열 생성
		int[] arr = new int[10];
		
		// 데이터를 서로 비교하기 위해 첫번째 값은 미리 담는다.
		arr[0] = Integer.parseInt(in.readLine())%42;
		
		// 출력 데이터를 계산하기 위한 int 변수 생성
		int res = 0;
		
		// 2중 for문으로 2번째 값부터 10번째 값까지 연산 결과(42로 나눈 나머지 값)를 담으면서
		//	새로 연산한 데이터가 이미 배열에 존재하는 값일 경우, res++을 수행한다.
		for (int i=1; i<10; i++) {
			arr[i] = Integer.parseInt(in.readLine())%42;

			for(int j=0; j<i; j++) {
				if(arr[i] == arr[j]) {
					res++;
					break;
				}
			}
		}
		
		// 10에서 res의 값을 빼면 출력 데이터(서로 다른 나머지가 몇 개 있는지)에 부합한다.
		System.out.println(10-res);
	}
}
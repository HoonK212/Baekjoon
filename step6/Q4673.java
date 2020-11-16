package baekjoon.step6;

public class Q4673 {
	int d(int number){
		int sum = number;
		while(number != 0){
			sum = sum + (number % 10);
			number = number/10;
		}
		return sum;
	}
}

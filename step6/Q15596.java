package baekjoon.step6;

public class Q15596 {
	public static void main(String[] args) {
		
		int[] a = {1, 2, 3, 4, 5};
		System.out.println(sum(a));
	}
	
	static long sum(int[] a) {

		int len = a.length;
		long res = 0;
		
		for(int i=0; i<len; i++) {
			res += a[i];
		}
		return res;
	}
}

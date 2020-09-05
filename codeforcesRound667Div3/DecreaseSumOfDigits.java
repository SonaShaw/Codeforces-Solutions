package codeforcesRound667Div3;

import java.util.*;
public class DecreaseSumOfDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0) {
			long n = sc.nextLong();
			int s = sc.nextInt();
			long step = 0;
			while(findSum(n)>s) {
				n++;
				step++;
			}
			System.out.println(step);
		}
	}

	private static int findSum(long n) {
		int s = 0;
		while(n>0) {
			s=s+(int)n%10;
			n=n/10;
		}
		return s;
	}

}

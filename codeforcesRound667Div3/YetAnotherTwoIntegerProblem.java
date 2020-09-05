package codeforcesRound667Div3;

import java.util.*;

public class YetAnotherTwoIntegerProblem {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int d = (a>b)?(a-b):(b-a);
			int step = 0;
			step = step + d/10;
			d = d%10;
			if(d!=0)
				step++;
			System.out.println(step);
		}
	}
}	

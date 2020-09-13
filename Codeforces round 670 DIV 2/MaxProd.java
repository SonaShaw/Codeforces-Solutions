package round670Div2;

import java.util.*;
public class MaxProd {
	public static void main(String args[]) {
		Scanner sc  = new Scanner(System.in);
		int t  = sc.nextInt();
		while(t-- > 0) {
			int n = sc.nextInt();
			int a[] = new int[n];
			for(int i=0; i<n; i++)
				a[i] = sc.nextInt();
			System.out.println(findMaxProduct(a));
		}
	}

	private static int findMaxProduct(int[] a) {
		Arrays.sort(a);
		int last = a.length-1;
		
		if(a[last]<=0)
			return a[last]*a[last-1]*a[last-2]*a[last-3]*a[last-4];
		else if(a[last-4]>0) {
			return a[last]*a[last-1]*a[last-2]*a[last-3]*a[last-4];
		}else {
			return a[0]*a[1]*a[2]*a[3]*a[last];
		}
		//return 0;
	}
}

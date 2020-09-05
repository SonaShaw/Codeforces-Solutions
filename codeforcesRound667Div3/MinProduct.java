package codeforcesRound667Div3;

import java.util.*;
public class MinProduct {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int x = sc.nextInt();
			int y = sc.nextInt();
			int n = sc.nextInt();
			if(a==b && y<x) {
				while(b>y && n>0) {
					b--;
					n--;
				}
			}else if(a==b && x<y) {
				while(a>x && n>0) {
					a--;
					n--;
				}
			}
			else if(a>b) {
				while(b>y && n>0) {
					b--;
					n--;
				}
			}else {
				while(a>x && n>0) {
					a--;
					n--;
				}
			}
			while(n>0) {
				if(a>x) 
					a--;
				
				if(b>y) 
					b--;
				n--;
			}
			System.out.println((long)a*b);	
		}

	}

}

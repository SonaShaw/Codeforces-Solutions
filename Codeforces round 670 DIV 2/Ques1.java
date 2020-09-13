package round670Div2;

import java.util.*;
public class Ques1 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0) {
			int n = sc.nextInt();
			int a[] = new int[n];
			int freq[] = new int[101];
			for(int i=0; i<n; i++) {
				a[i] = sc.nextInt();
				freq[a[i]]++;
			}
			
			int mexa = 0;
			int mexb = 0;
			for(int i=0; i<freq.length; i++) {
				if(freq[i] == 0) {
					mexa = i;
					//freq[i]--;
					break;
				}	
			}
			for(int i=0; i<freq.length; i++) {
				if(freq[i] <= 1) {
					mexb = i;
					//freq[i]--;
					break;
				}	
			}
			System.out.println(mexa+mexb);
			
		}
	}
}

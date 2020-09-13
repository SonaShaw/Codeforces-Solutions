package round670Div2;

import java.io.*; 
import java.util.*; 
  
public class MaxProduct { 
    static int maxProductSubarrayOfSizeK(int A[], int n, int k) 
    { 
        Arrays.sort(A); 
        int product = 1; 
        if (A[n - 1] == 0 && k % 2 != 0) 
            return 0; 
  
        if (A[n - 1] <= 0 && k % 2 != 0) { 
            for (int i = n - 1; i >= n - k; i--) 
                product *= A[i]; 
            return product; 
        } 
 
        int i = 0; 
        int j = n - 1; 
  
        if (k % 2 != 0) { 
            product *= A[j]; 
            j--; 
            k--; 
        } 
  
  
        k >>= 1; 
        for (int itr = 0; itr < k; itr++) {   
            int left_product = A[i] * A[i + 1]; 
  
            int right_product = A[j] * A[j - 1]; 
  
            if (left_product > right_product) { 
                product *= left_product; 
                i += 2; 
            } 
            else { 
                product *= right_product; 
                j -= 2; 
            } 
        } 
 
        return product; 
    } 

    public static void main(String[] args) 
    { 
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int a[] = new int[n];
            for(int i=0; i<a.length; i++)
                a[i] = sc.nextInt();
            
            System.out.println(maxProductSubarrayOfSizeK(a, n, 5)); 
        }
      
    } 
} 
 

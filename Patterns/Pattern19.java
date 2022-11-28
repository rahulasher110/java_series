/*
 
    *
   ***
  *****
   ***
    *
 
 
 */

package Patterns;

import java.util.Scanner;

public class Pattern19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		
		int n;
		
		n = s.nextInt();
		
		int i = 1;
		
		while(i <= n) {
			
			// first half
			if(i <= n/2 + 1) {
				
				// space
				
				int j = 1;
				
				while(j <= n/2 + 1 - i) {
					System.out.print(" ");
					j++;
				}
				
				// start
				
				int k = 1;
				while(k <= i) {
					System.out.print("*");
					k++;
				}
				
				int l = 1;
				
				while(i > 1 && l < i) {
					System.out.print("*");
					l++;
				}
				
				System.out.println("");
				
				
			}else {
				
				// second half
				
				// space
				
				int j = 1;
				
				while(j <= i - n/2 -1) {
					System.out.print(" ");
					j++;
				}
				
				
				// star
				int k = 1;
				
				while(k <= n - i + 1) {
					System.out.print("*");
					k++;
				}
				
				// star
				
				int l = 1;
				
				while(l <= n - i) {
					System.out.print("*");
					l++;
				}
				
				System.out.println("");
				
				
				
			}
			
			i++;
		}
		

	}

}

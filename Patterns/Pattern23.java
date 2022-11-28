/*
 
*
*1*
*121*
*12321*
*121*
*1*
*
 
 */

package Patterns;

import java.util.Scanner;

public class Pattern23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		
		int n;
		
		n = s.nextInt();
		
		int i = 1;
		
		System.out.println("*");
		
		while(i <= 2 * n - 1) {
			
			if( i <= n) {
				
				// first half
				
				int j = 1;
				System.out.print("*");
				while(j <= i) {
					System.out.print(j);
					j++;
				}
				
				int k = 1;
				
				while(i > 1 && k < i) {
					System.out.print(i - k);
					k++;
				}
				System.out.print("*");
				
				
				System.out.println("");
			}else {
				// second half
				
				int j = 1;
				System.out.print("*");
				
				while(j <= 2 * n - i) {
					System.out.print(j);
					j++;
				}
				
				int k = 1;
				
				while(k <= 2 * n - i - 1) {
					System.out.print(2 * n - i - k);
					k++;
				}
				System.out.print("*");
				
				System.out.println("");
				
			}
			
			
			
			i++;
		}
		System.out.println("*");

	}

}

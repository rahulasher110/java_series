/*
 
    1
   12
  123
 1234
 
 */

package Patterns;

import java.util.Scanner;

public class Pattern13 {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int n;
		n = s.nextInt();
		
		int i = 1;
		
		while(i <= n) {
			
			// space
			int k = 1;
			while(k <= n - i) {
				System.out.print(" ");
				k++;
			}
			
			
			// number 
			
			int j = 1;
			while(j <= i) {
				System.out.print(j);
				j++;
			}
			
			System.out.println("");
			
			i++;
		}
		
	}

}

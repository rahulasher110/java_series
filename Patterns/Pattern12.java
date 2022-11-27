/*
 
   *
  **
 ***
****
 
 
 */

package Patterns;

import java.util.Scanner;

public class Pattern12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		
		int n;
		n = s.nextInt();
		
		int i = 1;
		
		while(i <= n) {
			
			// space print
			
			int k = 1;
			
			while(k <= n - i) {
				System.out.print(" ");
				k++;
			}
			
			
			
			
			
			// stars print
			
			int j = 1;
			
			while(j <= i) {
				System.out.print("*");
				j++;
			}
			
			System.out.println("");
			
			i++;
		}

	}

}

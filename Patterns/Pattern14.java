/*
 
 
 ****
 ***
 **
 *
 
 */

package Patterns;

import java.util.Scanner;

public class Pattern14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		
		int n;
		n = s.nextInt();
		
		int i = 1;
		
		while(i <= n) {
			
			// star print
			
			int j = 1;
			
			while(j <= n - i + 1) {
				System.out.print("*");
				j++;
			}
			
			System.out.println("");
			
			i++;
		}

	}

}

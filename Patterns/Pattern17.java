/*
 
     *
    ***
   *****
  *******
 
 
 */

package Patterns;

import java.util.Scanner;
public class Pattern17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		
		int n;
		n = s.nextInt();
		
		int i = 1;
		
		while(i <= n) {
			
			// space
			
			int j = 1;
			
			while(j <= n - i) {
				System.out.print(" ");
				j++;
			}
			
			
			// stars
			
			int k = 1 ;
			while(k <= i) {
				System.out.print("*");
				k++;
			}
			
			
			// decreasing star
			
			int l = 1;
			
			while(i > 1 && l <= i - 1) {
				
				System.out.print("*");
				
				l++;
			}
			
			
			System.out.println("");
			
			i++;
		}
		

	}

}

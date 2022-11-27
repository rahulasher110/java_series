/*
 
      1
     232
    34543
   4567654
 
 */

package Patterns;

import java.util.Scanner;

public class Pattern18 {

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
			
			// number
			
			int k = 1;
			
			while(k <= i) {
				System.out.print(i + k - 1);
				k++;
			}
			
			
			// decreasing number
			
			int l = 1;
			
			while(i > 1 && l < i) {
				System.out.print(i + k - 1 - l - 1);
				l++;
			}
			
			
			
			System.out.println("");
			
			
			i++;
		}

	}

}

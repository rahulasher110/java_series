/*
 
      1
     121
    12321
   1234321 
 
 
 */

package Patterns;

import java.util.Scanner;

public class Pattern16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		
		int n;
		n = s.nextInt();
		
		int i = 1;
		
		while(i <= n) {
			
			// space
			
			int j = 1;
			
			while(j <= n - i + 1) {
				System.out.print(" ");
				j++;
			}
			
			// increasing number
			
			int k = 1;
			while(k <= i) {
				System.out.print(k);
				k++;
			}
			
			// decreasing number
			
			int l = 1;
			
			while(i > 1 && l < i) {
				
				System.out.print(i - l);
				l++;
				
			}
			
			System.out.println("");
//			
			i++;
		}

	}

}

/*
 
 4321
 4321
 4321
 4321
 
 */

package Patterns;

import java.util.Scanner;

public class Pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		int n;
		n = s.nextInt();
		
		int i = 1;
		
		
		while(i <= n) {
			
			int j = 1;
			
			while(j <= n) {
				System.out.print(n - j + 1);
				
				j++;
			}
			System.out.println("");
			
			i++;
		}

	}

}

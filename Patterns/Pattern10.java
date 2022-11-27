/*
 
 ABCD
 BCDE
 CDEF
 DEFG
 
 */

package Patterns;

import java.util.Scanner;

public class Pattern10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		
		int n;
		n = s.nextInt();
		
		int i = 1;
		
		while(i <= n) {
			
			int j = 1;
			while(j <= n) {
				
				System.out.print((char)('A' + j +i -1 - 1));
				
				j++;
			}
			
			System.out.println("");
			
			i++;
		}

	}

}

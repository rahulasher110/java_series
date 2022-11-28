/*
 
1357
3571
5713
7135
 
 */

package Patterns;

import java.util.Scanner;

public class Pattern22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		
		int n;
		n = s.nextInt();
		
		
		int i = 1;
		
		while(i <= n) {
			
			int j = 2 * i - 1;
			
			while(j <= n*2) {
				
				System.out.print(j);
				
				j += 2;
				
			}
			
			int k = 1;
			int num = 1;
			
			while(i > 1 && k < i) {
				System.out.print(num);
				k += 1;
				num += 2;
			}
			
			System.out.println("");
			
			i++;
		}

	}

}

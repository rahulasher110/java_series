/*
 
 1
 23
 345
 4567
 
 
 */

package Patterns;

import java.util.Scanner;

public class Pattern7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		
		int n;
		n = s.nextInt();
		
		int i = 1;
		
		while(i <= n) {
			
			int j = 1;
			int num = i;
			
			while(j <= i) {
				
				System.out.print(num++);
				
				j++;
			}
			
			System.out.println("");
			
			i++;
		}
		

	}

}

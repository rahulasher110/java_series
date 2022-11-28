/*
 
1=1
1+2=3
1+2+3=6
1+2+3+4=10
1+2+3+4+5=15
 
 
 */

package Patterns;

import java.util.Scanner;

public class Pattern21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		
		
		int n;
		n = s.nextInt();
		
		int i = 1;
		
		while(i <= n) {
			
			int j = 1;
			int sum = 0;
			
			while(j <= i) {
				
				sum += j;
				System.out.print(j);
				
				if( j == i) {
					System.out.print("=");
				}else {
					System.out.print("+");
				}
				
				j++;
			}
			
			System.out.println(sum);
			
			
			i++;
		}

	}

}

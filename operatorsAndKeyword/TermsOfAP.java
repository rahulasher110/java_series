/*
 
 Write a program to print first x terms of the series 3N + 2 which are not multiples of 4.

Input format :
Integer x

Output format :
Terms of series (separated by space)
 
 */

package operatorsAndKeyword;

import java.util.Scanner;

public class TermsOfAP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		
		int n;
		n = s.nextInt();
		
		int i = 1;
		
		while(i <= n) {
			
			int series = 3 * i + 2;
			
			if(series % 4 == 0) {
				n++;
			}
			else {
				System.out.print(series + " ");
			}
			
			
			i++;
		}

	}

}

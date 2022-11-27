/*
 
 Write a program to find x to the power n (i.e. x^n). Take x and n from the user. You need to print the answer.
Note : For this question, you can assume that 0 raised to the power of 0 is 1


Input format :
Two integers x and n (separated by space)
Output Format :
x^n (i.e. x raise to the power n)
 
 */

package fundamentals;

import java.util.Scanner;

public class PowerOfANumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		
		int x, n;
		
		x = s.nextInt();
		n = s.nextInt();
		
		
		int i = 1;
		int product = 1;
		
		while(i <= n) {
			product *= x ;
			i++;
		}
		
		System.out.println(product);

	}

}

/*
 
 Write a program to print all the factors of a number other than 1 and the number itself.
Input Format :
A single integer, n
Output Format :
All the factors of n excluding 1 and the number itself
 
 */

package fundamentals;

import java.util.Scanner;

public class Factors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		
		int n;
		n = s.nextInt();
		
		int div = 2;
		
		while(div < n) {
			if(n % div == 0) {
				System.out.print(div + " ");
			}
			div++;
		}

	}

}

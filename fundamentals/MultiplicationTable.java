/*
 
 Write a program to print multiplication table of n
Input Format :
A single integer, n
Output Format :
First 10 multiples of n each printed in new line
 
 */

package fundamentals;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		
		int n;
		n = s.nextInt();
		
		int i = 1;
		while(i <= 10) {
			System.out.println(n * i);
			i++;
		}
		

	}

}

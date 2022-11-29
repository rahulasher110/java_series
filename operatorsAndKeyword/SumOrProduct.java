/*
 
 Write a program that asks the user for a number N and a choice C. And then give them the possibility to choose between computing the sum and computing the product of all integers in the range 1 to N (both inclusive).
If C is equal to -
 1, then print the sum
 2, then print the product
 Any other number, then print '-1' (without the quotes)
Input format :
Line 1 : Integer N
Line 2 : Choice C
Output Format :
 Sum or product according to user's choice
 
 
 */


package operatorsAndKeyword;

import java.util.Scanner;

public class SumOrProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		
		int n, c;
		n = s.nextInt();
		c = s.nextInt();
		
		int sum = 0, product = 1;
		
		if(c == 1) {
			int i = 1;
			while(i <= n) {
				sum += i;
				i++;
			}
			System.out.println(sum);
		}
		else if(c == 2) {
			int j = 1;
			
			while(j <= n) {
				product = product * j;
				j++;
			}
			
			System.out.println(product);
		}
		else {
			System.out.println(-1);
		}

	}

}

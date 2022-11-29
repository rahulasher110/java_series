/*
 
 Given an integer N, print all the prime numbers that lie in the range 2 to N (both inclusive).
Print the prime numbers in different lines.

Input Format :
Integer N

Output Format :
Prime numbers in different lines
 
 
 */

package operatorsAndKeyword;

import java.util.Scanner;

public class AllPrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		int n;
		
		n = s.nextInt();
		
		
		
		int i = 2 ;
		while(i <= n) {
			int j = 2;
			boolean isPrime = true;
			while(j < i){
				if(i % j == 0) {
					isPrime = false;
					break;
				}
				j++;
			}
			if(isPrime)
				System.out.println(j);
			i++;
		}
		

	}

}

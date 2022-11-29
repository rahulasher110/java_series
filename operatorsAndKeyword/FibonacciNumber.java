/*
 
 Nth term of Fibonacci series F(n), where F(n) is a function, is calculated using the following formula -
    F(n) = F(n-1) + F(n-2), 
    Where, F(1) =  1, 
           F(2) = 1
Provided N you have to find out the Nth Fibonacci Number.

Input Format :
The first line of each test case contains a real number ‘N’.

Output Format :
For each test case, return its equivalent Fibonacci number.
 
 fibonacci series  : --   [ 1, 1, 2, 3, 5, 8, 13, 21]
 
 */


package operatorsAndKeyword;

import java.util.Scanner;

public class FibonacciNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		
		int n;
		n = s.nextInt();
		
		int a = 1, b = 1;
		int c = 0;
		
		if(n == 1 || n == 2) {
			System.out.println(a);
		}
		else {
			for(int i = 3 ;i <= n; i++) {
				c = a + b;
				a = b;
				b = c;
			}
			System.out.println(c);
		}
		

	}

}

/*
 
 Given a number N, figure out if it is a member of fibonacci series or not. Return true if the number is member of fibonacci series else false.
Fibonacci Series is defined by the recurrence
    F(n) = F(n-1) + F(n-2)
where F(0) = 0 and F(1) = 1


Input Format :
Integer N
Output Format :
true or false
 
 */

package functionAndScope;

import java.util.Scanner;

public class FibonacciNumber {
	
	public static boolean checkMember(int n) {
		
		int a = 1, b = 2, c = 0;
		
		if(n == 0 || n == 1 || n == 2) {
			return true;
		}
		else {
			for(int i = 4; i<=n; i++) {
				c = a + b;
				if(c == n) {
					return true;
				}
				a = b;
				b = c;
			}
			return false;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		
		int n;
		n = s.nextInt();
		
		System.out.println(checkMember(n));

	}

}

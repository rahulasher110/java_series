/*
 
 We are given a 4 digit number using digits 1 to 9. What is the maximum 3 digit number that we can make by removing one digit from the given integer.

Input Format :
A 4 digit number

Output Format :
A 3 digit number

Sample Input :
5438

Sample Output :
548

Explanation :
1. If we remove 5, the new number is 438.
2. If we remove 4, the new number is 538.
3. If we remove 3, the new number is 548.
4. If we remove 8, the new number is 543.
Out of the 4 cases removing 3 gives us the maximum 3 digit number i.e 548

 
 */

package functionAndScope;

import java.util.Scanner;

public class MaximumNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		
		int n;
		n = s.nextInt();
		
		/*
		 
		 5438 = 5438 % (10 ^ k) + 5438 / (10 ^ k+1) * (10 ^ k)
		 
	k = 0: 5438 % 1 + 5438 / 10 * 1 = 0 + 543 = 543
	k = 1: 5438 % 10 + 5438 / 100 * 10 = 8 + 540 = 548
	k = 2: 5438 % 100 + 5438 / 1000 * 100 = 38 + 500 = 538
	k = 3: 5438 % 1000 + 5438 / 10000 * 1000 = 438 + 0 = 438

		
		 
		 */
		int max = 0;
		
		for(int i = 0 ; i<4 ;i++) {
			max = Math.max(max, n % (int)Math.pow(10,i) + n / (int)Math.pow(10, i+1) * (int)Math.pow(10,i));
			System.out.println("max -> " + max + " number -> " +  n % (int)Math.pow(10,i) + n / (int)Math.pow(10, i+1) * (int)Math.pow(10,i));
		}
		
		System.out.println(max);
		
	}

}

/*
 
 Write a program to determine if given number is palindrome or not. Print true if it is palindrome, false otherwise.
Palindrome are the numbers for which reverse is exactly same as the original one. For eg. 121

Sample Input 1 :
121

Sample Output 1 :
true

Sample Input 2 :
1032

Sample Output 2 :
false
 
 */


package operatorsAndKeyword;

import java.util.Scanner;

public class CheckPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		
		int n;
		n = s.nextInt();
		
		int palindromeNumber = 0;
		
		int duplicateNumber = n;
		
		
		while(n > 0) {
			int rem = n % 10;
			palindromeNumber = 10 * palindromeNumber + rem;
			n = n / 10;
		}
		
		if(duplicateNumber == palindromeNumber) {
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}

	}

}

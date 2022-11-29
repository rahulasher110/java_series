/*
 
 Given a binary number as an integer N, convert it into decimal and print.

Input format :
An integer N in the Binary Format

Output format :
Corresponding Decimal number (as integer)
 
 */

package operatorsAndKeyword;

import java.util.*;
import java.lang.Math;


public class BinaryToDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		
		int n;
		n = s.nextInt();
		
		int sum = 0;
		int i = 0;
		
		while(n > 0) {
			int rem = n % 10; // 10 - > 0
			
			sum = sum + rem * (int)Math.pow(2, i);
			i++;
			
			n = n / 10;
		}
		
		System.out.println(sum);

	}

}

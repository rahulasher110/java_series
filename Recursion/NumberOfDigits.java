/*
 
 Given the number 'n', find out and return the number of digits present in a number .
Input Format :
Integer n
Output Format :
Count of digits
Constraints :
1 <= n <= 10^6
Sample Input 1 :
 156
Sample Output 1 :
3
Sample Input 2 :
 7
Sample Output 2 :
1
 
 */

package Recursion;
import java.util.Scanner;

public class NumberOfDigits {
	
	public static int count(int n) {
		
		if(n <= 0) {
			return 0;
		}
		
		int smallOutput = count(n / 10);
		
		int output = 1 + smallOutput;
		
		return output;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		
		int res = count(n);
		
		System.out.println(res);

	}

}





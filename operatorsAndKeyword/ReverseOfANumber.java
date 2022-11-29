/*
 
 Write a program to generate the reverse of a given number N. Print the corresponding reverse number.
Note : If a number has trailing zeros, then its reverse will not include them. For e.g., reverse of 10400 will be 401 instead of 00401.


Input format :
Integer N

Output format :
Corresponding reverse number
 
 */


package operatorsAndKeyword;
import java.util.Scanner;

public class ReverseOfANumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		
		int n;
		n = s.nextInt();
		
		int sum = 0;
		
		while(n > 0) {
			int rem = n % 10; // 2
			
			sum = sum * 10 + rem; // 2
			
			n = n / 10;
			
		}
		
		System.out.println(sum);

	}

}
